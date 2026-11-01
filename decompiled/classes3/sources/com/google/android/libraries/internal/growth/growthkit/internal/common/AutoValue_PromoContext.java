package com.google.android.libraries.internal.growth.growthkit.internal.common;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class AutoValue_PromoContext extends com.google.android.libraries.internal.growth.growthkit.internal.common.PromoContext {
    private final java.lang.String b;
    private final akhl c;
    private final long d;
    private final aigf e;
    private final defpackage.aksc f;
    private final java.lang.String g;

    public AutoValue_PromoContext(java.lang.String str, akhl akhlVar, long j, aigf aigfVar, defpackage.aksc akscVar, java.lang.String str2) {
        this.b = str;
        this.c = akhlVar;
        this.d = j;
        this.e = aigfVar;
        this.f = akscVar;
        this.g = str2;
    }

    @Override // com.google.android.libraries.internal.growth.growthkit.internal.common.PromoContext
    public final long a() {
        return this.d;
    }

    @Override // com.google.android.libraries.internal.growth.growthkit.internal.common.PromoContext
    public final aigf b() {
        return this.e;
    }

    @Override // com.google.android.libraries.internal.growth.growthkit.internal.common.PromoContext
    public final akhl c() {
        return this.c;
    }

    @Override // com.google.android.libraries.internal.growth.growthkit.internal.common.PromoContext
    public final defpackage.aksc d() {
        return this.f;
    }

    @Override // com.google.android.libraries.internal.growth.growthkit.internal.common.PromoContext
    public final java.lang.String e() {
        return this.b;
    }

    public final boolean equals(java.lang.Object obj) {
        defpackage.aksc akscVar;
        java.lang.String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof com.google.android.libraries.internal.growth.growthkit.internal.common.PromoContext) {
            com.google.android.libraries.internal.growth.growthkit.internal.common.PromoContext promoContext = (com.google.android.libraries.internal.growth.growthkit.internal.common.PromoContext) obj;
            java.lang.String str2 = this.b;
            if (str2 != null ? str2.equals(promoContext.e()) : promoContext.e() == null) {
                if (this.c.equals(promoContext.c()) && this.d == promoContext.a() && this.e.equals(promoContext.b()) && ((akscVar = this.f) != null ? akscVar.equals(promoContext.d()) : promoContext.d() == null) && ((str = this.g) != null ? str.equals(promoContext.f()) : promoContext.f() == null)) {
                    promoContext.g();
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.google.android.libraries.internal.growth.growthkit.internal.common.PromoContext
    public final java.lang.String f() {
        return this.g;
    }

    public final int hashCode() {
        java.lang.String str = this.b;
        int iHashCode = (((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.c.hashCode();
        long j = this.d;
        int iHashCode2 = (((iHashCode * 1000003) ^ ((int) ((j >>> 32) ^ j))) * 1000003) ^ this.e.hashCode();
        defpackage.aksc akscVar = this.f;
        int iHashCode3 = ((iHashCode2 * 1000003) ^ (akscVar == null ? 0 : akscVar.hashCode())) * 1000003;
        java.lang.String str2 = this.g;
        return (iHashCode3 ^ (str2 != null ? str2.hashCode() : 0)) * 1000003;
    }

    public final java.lang.String toString() {
        defpackage.aksc akscVar = this.f;
        aigf aigfVar = this.e;
        return "PromoContext{accountName=" + this.b + ", promotion=" + java.lang.String.valueOf(this.c) + ", triggeringEventTimeMs=" + this.d + ", actionTypeIntentMap=" + java.lang.String.valueOf(aigfVar) + ", versionedIdentifier=" + java.lang.String.valueOf(akscVar) + ", representativeTargetId=" + this.g + ", collaboratorMetadata=null}";
    }

    @Override // com.google.android.libraries.internal.growth.growthkit.internal.common.PromoContext
    public final void g() {
    }
}
