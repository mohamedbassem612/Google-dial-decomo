package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class hue {
    public final java.lang.String a;
    public final java.lang.String b;
    public final java.lang.String c;
    public final java.lang.String d;
    public final int e;

    public hue(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i) {
        aooh.f(str, "originalNumber");
        aooh.f(str2, "transformedNumber");
        aooh.f(str3, "userHomeCountryCode");
        aooh.f(str4, "userRoamingCountryCode");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = i;
    }

    public static final defpackage.hue b(android.os.Bundle bundle) {
        aooh.f(bundle, "transformationInfoBundle");
        java.lang.String string = bundle.getString("TRANSFORMATION_INFO_ORIGINAL_NUMBER");
        if (string == null) {
            throw new java.lang.IllegalStateException("Required value was null.");
        }
        java.lang.String string2 = bundle.getString("TRANSFORMATION_INFO_TRANSFORMED_NUMBER");
        if (string2 == null) {
            throw new java.lang.IllegalStateException("Required value was null.");
        }
        java.lang.String string3 = bundle.getString("TRANSFORMATION_INFO_USER_HOME_COUNTRY_CODE");
        if (string3 == null) {
            throw new java.lang.IllegalStateException("Required value was null.");
        }
        java.lang.String string4 = bundle.getString("TRANSFORMATION_INFO_USER_ROAMING_COUNTRY_CODE");
        if (string4 != null) {
            return new defpackage.hue(string, string2, string3, string4, bundle.getInt("TRANSFORMATION_INFO_TRANSFORMED_NUMBER_COUNTRY_CALLING_CODE"));
        }
        throw new java.lang.IllegalStateException("Required value was null.");
    }

    public final android.os.Bundle a() {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("TRANSFORMATION_INFO_ORIGINAL_NUMBER", this.a);
        bundle.putString("TRANSFORMATION_INFO_TRANSFORMED_NUMBER", this.b);
        bundle.putString("TRANSFORMATION_INFO_USER_HOME_COUNTRY_CODE", this.c);
        bundle.putString("TRANSFORMATION_INFO_USER_ROAMING_COUNTRY_CODE", this.d);
        bundle.putInt("TRANSFORMATION_INFO_TRANSFORMED_NUMBER_COUNTRY_CALLING_CODE", this.e);
        return bundle;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.hue) {
            defpackage.hue hueVar = (defpackage.hue) obj;
            if (aooh.n(this.a, hueVar.a) && aooh.n(this.b, hueVar.b) && aooh.n(this.c, hueVar.c) && aooh.n(this.d, hueVar.d) && this.e == hueVar.e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e;
    }

    public final java.lang.String toString() {
        return "TransformationInfo(originalNumber=" + this.a + ", transformedNumber=" + this.b + ", userHomeCountryCode=" + this.c + ", userRoamingCountryCode=" + this.d + ", transformedNumberCountryCallingCode=" + this.e + ')';
    }
}
