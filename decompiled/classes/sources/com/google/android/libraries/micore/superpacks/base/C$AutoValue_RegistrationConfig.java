package com.google.android.libraries.micore.superpacks.base;

/* JADX INFO: renamed from: com.google.android.libraries.micore.superpacks.base.$AutoValue_RegistrationConfig, reason: invalid class name */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public abstract class C$AutoValue_RegistrationConfig extends com.google.android.libraries.micore.superpacks.base.RegistrationConfig {
    public final java.lang.String a;
    public final java.lang.String b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final defpackage.aify h;
    public final defpackage.adhv i;

    public C$AutoValue_RegistrationConfig(java.lang.String str, java.lang.String str2, int i, int i2, int i3, int i4, int i5, defpackage.aify aifyVar, defpackage.adhv adhvVar) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.f = i4;
        this.g = i5;
        if (aifyVar == null) {
            throw new java.lang.NullPointerException("Null validationSchemes");
        }
        this.h = aifyVar;
        this.i = adhvVar;
    }

    @Override // com.google.android.libraries.micore.superpacks.base.RegistrationConfig
    public final int a() {
        return this.f;
    }

    @Override // com.google.android.libraries.micore.superpacks.base.RegistrationConfig
    public final int b() {
        return this.d;
    }

    @Override // com.google.android.libraries.micore.superpacks.base.RegistrationConfig
    public final int c() {
        return this.c;
    }

    @Override // com.google.android.libraries.micore.superpacks.base.RegistrationConfig
    public final int d() {
        return this.e;
    }

    @Override // com.google.android.libraries.micore.superpacks.base.RegistrationConfig
    public final int e() {
        return this.g;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof com.google.android.libraries.micore.superpacks.base.RegistrationConfig) {
            com.google.android.libraries.micore.superpacks.base.RegistrationConfig registrationConfig = (com.google.android.libraries.micore.superpacks.base.RegistrationConfig) obj;
            java.lang.String str = this.a;
            if (str != null ? str.equals(registrationConfig.i()) : registrationConfig.i() == null) {
                java.lang.String str2 = this.b;
                if (str2 != null ? str2.equals(registrationConfig.h()) : registrationConfig.h() == null) {
                    if (this.c == registrationConfig.c() && this.d == registrationConfig.b() && this.e == registrationConfig.d() && this.f == registrationConfig.a() && this.g == registrationConfig.e() && defpackage.ahvr.aP(this.h, registrationConfig.g()) && this.i.equals(registrationConfig.f())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // com.google.android.libraries.micore.superpacks.base.RegistrationConfig
    public final defpackage.adhv f() {
        return this.i;
    }

    @Override // com.google.android.libraries.micore.superpacks.base.RegistrationConfig
    public final defpackage.aify g() {
        return this.h;
    }

    @Override // com.google.android.libraries.micore.superpacks.base.RegistrationConfig
    public final java.lang.String h() {
        return this.b;
    }

    public final int hashCode() {
        java.lang.String str = this.a;
        int iHashCode = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.b;
        return ((((((((((((((((iHashCode ^ 1000003) * 1000003) ^ (str2 != null ? str2.hashCode() : 0)) * 1000003) ^ this.c) * 1000003) ^ this.d) * 1000003) ^ this.e) * 1000003) ^ this.f) * 1000003) ^ this.g) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.i.hashCode();
    }

    @Override // com.google.android.libraries.micore.superpacks.base.RegistrationConfig
    public final java.lang.String i() {
        return this.a;
    }
}
