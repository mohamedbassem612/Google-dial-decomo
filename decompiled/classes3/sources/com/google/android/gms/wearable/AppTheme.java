package com.google.android.gms.wearable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class AppTheme extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.common.internal.ReflectedParcelable {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.aatx(6);
    public int a;
    public com.google.android.gms.wearable.AppTheme.Icon b;
    public com.google.android.gms.wearable.AppTheme.Headline c;
    public com.google.android.gms.wearable.AppTheme.Description d;
    public com.google.android.gms.wearable.AppTheme.CallToAction e;
    private int f;
    private int g;
    private int h;
    private int i;

    public AppTheme(int i, int i2, int i3, int i4, int i5, com.google.android.gms.wearable.AppTheme.Icon icon, com.google.android.gms.wearable.AppTheme.Headline headline, com.google.android.gms.wearable.AppTheme.Description description, com.google.android.gms.wearable.AppTheme.CallToAction callToAction) {
        this.f = 0;
        this.g = 0;
        this.h = 0;
        this.i = 0;
        this.a = 0;
        this.b = new com.google.android.gms.wearable.AppTheme.Icon();
        this.c = new com.google.android.gms.wearable.AppTheme.Headline();
        this.d = new com.google.android.gms.wearable.AppTheme.Description();
        this.e = new com.google.android.gms.wearable.AppTheme.CallToAction();
        this.f = i;
        this.g = i2;
        this.h = i3;
        this.i = i4;
        this.a = i5;
        this.b = icon == null ? new com.google.android.gms.wearable.AppTheme.Icon() : icon;
        this.c = headline == null ? new com.google.android.gms.wearable.AppTheme.Headline() : headline;
        this.d = description == null ? new com.google.android.gms.wearable.AppTheme.Description() : description;
        this.e = callToAction == null ? new com.google.android.gms.wearable.AppTheme.CallToAction() : callToAction;
    }

    public final int a() {
        int i = this.f;
        if (i == 0) {
            return 1;
        }
        return i;
    }

    public final int b() {
        int i = this.g;
        if (i == 0) {
            return 1;
        }
        return i;
    }

    public final int c() {
        int i = this.h;
        if (i == 0) {
            return 1;
        }
        return i;
    }

    public final int d() {
        int i = this.i;
        if (i == 0) {
            return 3;
        }
        return i;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof com.google.android.gms.wearable.AppTheme) {
            com.google.android.gms.wearable.AppTheme appTheme = (com.google.android.gms.wearable.AppTheme) obj;
            if (b() == appTheme.b() && a() == appTheme.a() && c() == appTheme.c() && d() == appTheme.d() && this.a == appTheme.a && j$.util.Objects.equals(this.b, appTheme.b) && j$.util.Objects.equals(this.c, appTheme.c) && j$.util.Objects.equals(this.d, appTheme.d) && j$.util.Objects.equals(this.e, appTheme.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((((((((((((b() * 31) + a()) * 31) + c()) * 31) + d()) * 31) + this.a) * 31) + j$.util.Objects.hashCode(this.b)) * 31) + j$.util.Objects.hashCode(this.c)) * 31) + j$.util.Objects.hashCode(this.d)) * 31) + j$.util.Objects.hashCode(this.e);
    }

    public final java.lang.String toString() {
        return "AppTheme {deviceExperience =" + this.a + ", colorTheme =" + a() + ", dynamicColor =" + b() + ", screenItemsSize =" + d() + ", screenAlignment =" + c() + ", icon =" + java.lang.String.valueOf(this.b) + ", headline =" + java.lang.String.valueOf(this.c) + ", description =" + java.lang.String.valueOf(this.d) + ", callToAction =" + java.lang.String.valueOf(this.e) + '}';
    }

    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iF = aais.f(parcel, 20293);
        aais.l(parcel, 1, a());
        aais.l(parcel, 2, b());
        aais.l(parcel, 3, c());
        aais.l(parcel, 4, d());
        aais.l(parcel, 5, this.a);
        aais.z(parcel, 6, this.b, i);
        aais.z(parcel, 7, this.c, i);
        aais.z(parcel, 8, this.d, i);
        aais.z(parcel, 9, this.e, i);
        aais.g(parcel, iF);
    }

    /* JADX INFO: compiled from: PG */
    public class Icon extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
        public static final android.os.Parcelable.Creator CREATOR = new defpackage.aatx(14);
        public final int a;

        public Icon() {
            this.a = 0;
        }

        public final boolean equals(java.lang.Object obj) {
            if (this != obj) {
                return obj != null && getClass() == obj.getClass() && this.a == ((com.google.android.gms.wearable.AppTheme.Icon) obj).a;
            }
            return true;
        }

        public final int hashCode() {
            return j$.util.Objects.hashCode(java.lang.Integer.valueOf(this.a));
        }

        public final java.lang.String toString() {
            return "Icon { componentAlignment=" + this.a + " }";
        }

        public final void writeToParcel(android.os.Parcel parcel, int i) {
            int iF = aais.f(parcel, 20293);
            aais.l(parcel, 1, this.a);
            aais.g(parcel, iF);
        }

        public Icon(int i) {
            this.a = i;
        }
    }

    /* JADX INFO: compiled from: PG */
    public class Description extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
        public static final android.os.Parcelable.Creator CREATOR = new defpackage.aatx(12);
        public final int a;
        public final int b;

        public Description() {
            this.a = 0;
            this.b = 0;
        }

        public final boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && getClass() == obj.getClass()) {
                com.google.android.gms.wearable.AppTheme.Description description = (com.google.android.gms.wearable.AppTheme.Description) obj;
                if (this.a == description.a && this.b == description.b) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return j$.util.Objects.hash(new java.lang.Object[]{java.lang.Integer.valueOf(this.a), java.lang.Integer.valueOf(this.b)});
        }

        public final java.lang.String toString() {
            return "Description { textAlignment=" + this.a + ", textSize=" + this.b + " }";
        }

        public final void writeToParcel(android.os.Parcel parcel, int i) {
            int iF = aais.f(parcel, 20293);
            aais.l(parcel, 1, this.a);
            aais.l(parcel, 2, this.b);
            aais.g(parcel, iF);
        }

        public Description(int i, int i2) {
            this.a = i;
            this.b = i2;
        }
    }

    /* JADX INFO: compiled from: PG */
    public class CallToAction extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
        public static final android.os.Parcelable.Creator CREATOR = new defpackage.aatx(8);
        public final int a;
        public final int b;
        public final int c;

        public CallToAction() {
            this.a = 0;
            this.b = 0;
            this.c = 0;
        }

        public final boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && getClass() == obj.getClass()) {
                com.google.android.gms.wearable.AppTheme.CallToAction callToAction = (com.google.android.gms.wearable.AppTheme.CallToAction) obj;
                if (this.a == callToAction.a && this.b == callToAction.b && this.c == callToAction.c) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return j$.util.Objects.hash(new java.lang.Object[]{java.lang.Integer.valueOf(this.a), java.lang.Integer.valueOf(this.b), java.lang.Integer.valueOf(this.c)});
        }

        public final java.lang.String toString() {
            return "CallToAction { textSize=" + this.a + ", buttonSize=" + this.b + ", cornerRadius=" + this.c + " }";
        }

        public final void writeToParcel(android.os.Parcel parcel, int i) {
            int iF = aais.f(parcel, 20293);
            aais.l(parcel, 1, this.a);
            aais.l(parcel, 2, this.b);
            aais.l(parcel, 3, this.c);
            aais.g(parcel, iF);
        }

        public CallToAction(int i, int i2, int i3) {
            this.a = i;
            this.b = i2;
            this.c = i3;
        }
    }

    /* JADX INFO: compiled from: PG */
    public class Headline extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
        public static final android.os.Parcelable.Creator CREATOR = new defpackage.aatx(13);
        public final int a;
        public final int b;
        public final int c;

        public Headline() {
            this.a = 0;
            this.b = 0;
            this.c = 0;
        }

        public final boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && getClass() == obj.getClass()) {
                com.google.android.gms.wearable.AppTheme.Headline headline = (com.google.android.gms.wearable.AppTheme.Headline) obj;
                if (this.a == headline.a && this.b == headline.b && this.c == headline.c) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return j$.util.Objects.hash(new java.lang.Object[]{java.lang.Integer.valueOf(this.a), java.lang.Integer.valueOf(this.b), java.lang.Integer.valueOf(this.c)});
        }

        public final java.lang.String toString() {
            return "Headline { textAlignment=" + this.a + ", textWeight=" + this.b + ", textSize=" + this.c + " }";
        }

        public final void writeToParcel(android.os.Parcel parcel, int i) {
            int iF = aais.f(parcel, 20293);
            aais.l(parcel, 1, this.a);
            aais.l(parcel, 2, this.b);
            aais.l(parcel, 3, this.c);
            aais.g(parcel, iF);
        }

        public Headline(int i, int i2, int i3) {
            this.a = i;
            this.b = i2;
            this.c = i3;
        }
    }

    public AppTheme() {
        this.f = 0;
        this.g = 0;
        this.h = 0;
        this.i = 0;
        this.a = 0;
        this.b = new com.google.android.gms.wearable.AppTheme.Icon();
        this.c = new com.google.android.gms.wearable.AppTheme.Headline();
        this.d = new com.google.android.gms.wearable.AppTheme.Description();
        this.e = new com.google.android.gms.wearable.AppTheme.CallToAction();
    }
}
