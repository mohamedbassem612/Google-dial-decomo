package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ymk {
    public final java.lang.String a;
    public final java.lang.String b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    private final int g;
    private final java.lang.String h;
    private final int i;

    public ymk(java.lang.String str, java.lang.String str2, int i, int i2, int i3, int i4, int i5, java.lang.String str3, int i6) {
        if (str == null) {
            throw new java.lang.NullPointerException("Null name");
        }
        this.a = str;
        if (str2 == null) {
            throw new java.lang.NullPointerException("Null modelName");
        }
        this.b = str2;
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.f = i4;
        this.g = i5;
        this.h = str3;
        this.i = i6;
    }

    public static defpackage.ymk b(com.google.android.apps.aicore.aidl.AIFeature aIFeature) {
        java.lang.String str = aIFeature.h;
        if (str == null) {
            str = "";
        }
        return new defpackage.ymk(aIFeature.a, aIFeature.b, aIFeature.c, aIFeature.d, aIFeature.e, aIFeature.f, aIFeature.g, str, aIFeature.i);
    }

    public final com.google.android.apps.aicore.aidl.AIFeature a() {
        return new com.google.android.apps.aicore.aidl.AIFeature(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i);
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.ymk) {
            defpackage.ymk ymkVar = (defpackage.ymk) obj;
            if (this.a.equals(ymkVar.a) && this.b.equals(ymkVar.b) && this.c == ymkVar.c && this.d == ymkVar.d && this.e == ymkVar.e && this.f == ymkVar.f && this.g == ymkVar.g && this.h.equals(ymkVar.h) && this.i == ymkVar.i) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c) * 1000003) ^ this.d) * 1000003) ^ this.e) * 1000003) ^ this.f) * 1000003) ^ this.g) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.i;
    }

    public final java.lang.String toString() {
        return "AiFeature{name=" + this.a + ", modelName=" + this.b + ", type=" + this.c + ", variant=" + this.d + ", id=" + this.e + ", version=" + this.f + ", customerId=" + this.g + ", description=" + this.h + ", releaseStage=" + this.i + '}';
    }

    public ymk() {
        throw null;
    }
}
