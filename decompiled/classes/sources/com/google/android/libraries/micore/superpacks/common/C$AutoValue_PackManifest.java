package com.google.android.libraries.micore.superpacks.common;

/* JADX INFO: renamed from: com.google.android.libraries.micore.superpacks.common.$AutoValue_PackManifest, reason: invalid class name */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public abstract class C$AutoValue_PackManifest extends com.google.android.libraries.micore.superpacks.common.PackManifest {
    public final java.lang.String a;
    public final java.lang.String b;
    public final long c;
    public final long d;
    public final int e;
    public final int f;
    public final defpackage.aify g;
    public final java.lang.String h;
    private final com.google.android.libraries.micore.superpacks.base.VersionedName i;
    private final defpackage.aify m;
    private final boolean n;
    private final java.util.Date o;
    private final defpackage.aigf p;

    public C$AutoValue_PackManifest(com.google.android.libraries.micore.superpacks.base.VersionedName versionedName, java.lang.String str, java.lang.String str2, long j, long j2, int i, int i2, defpackage.aify aifyVar, defpackage.aify aifyVar2, java.lang.String str3, boolean z, java.util.Date date, defpackage.aigf aigfVar) {
        this.i = versionedName;
        if (str == null) {
            throw new java.lang.NullPointerException("Null namespace");
        }
        this.a = str;
        if (str2 == null) {
            throw new java.lang.NullPointerException("Null name");
        }
        this.b = str2;
        this.c = j;
        this.d = j2;
        this.e = i;
        this.f = i2;
        if (aifyVar == null) {
            throw new java.lang.NullPointerException("Null downloadUrls");
        }
        this.g = aifyVar;
        if (aifyVar2 == null) {
            throw new java.lang.NullPointerException("Null validationSchemes");
        }
        this.m = aifyVar2;
        this.h = str3;
        this.n = z;
        if (date == null) {
            throw new java.lang.NullPointerException("Null expiryDate");
        }
        this.o = date;
        if (aigfVar == null) {
            throw new java.lang.NullPointerException("Null extraMap");
        }
        this.p = aigfVar;
    }

    @Override // com.google.android.libraries.micore.superpacks.common.PackManifest
    public final int a() {
        return this.f;
    }

    @Override // com.google.android.libraries.micore.superpacks.common.PackManifest
    public final int b() {
        return this.e;
    }

    @Override // com.google.android.libraries.micore.superpacks.common.PackManifest
    public final long c() {
        return this.d;
    }

    @Override // com.google.android.libraries.micore.superpacks.common.PackManifest
    public final long d() {
        return this.c;
    }

    @Override // com.google.android.libraries.micore.superpacks.common.PackManifest
    public final com.google.android.libraries.micore.superpacks.base.VersionedName e() {
        return this.i;
    }

    @Override // com.google.android.libraries.micore.superpacks.common.PackManifest
    public final defpackage.adis f() {
        return new defpackage.adis(this);
    }

    @Override // com.google.android.libraries.micore.superpacks.common.PackManifest
    public final defpackage.aify g() {
        return this.g;
    }

    @Override // com.google.android.libraries.micore.superpacks.common.PackManifest
    public final defpackage.aify h() {
        return this.m;
    }

    @Override // com.google.android.libraries.micore.superpacks.common.PackManifest
    public final defpackage.aigf i() {
        return this.p;
    }

    @Override // com.google.android.libraries.micore.superpacks.common.PackManifest
    public final java.lang.String j() {
        return this.b;
    }

    @Override // com.google.android.libraries.micore.superpacks.common.PackManifest
    public final java.lang.String k() {
        return this.a;
    }

    @Override // com.google.android.libraries.micore.superpacks.common.PackManifest
    public final java.lang.String l() {
        return this.h;
    }

    @Override // com.google.android.libraries.micore.superpacks.common.PackManifest
    public final java.util.Date m() {
        return this.o;
    }

    @Override // com.google.android.libraries.micore.superpacks.common.PackManifest
    public final boolean n() {
        return this.n;
    }
}
