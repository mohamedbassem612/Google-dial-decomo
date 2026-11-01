package com.google.android.libraries.micore.superpacks;

/* JADX INFO: renamed from: com.google.android.libraries.micore.superpacks.$AutoValue_SuperpackManifest, reason: invalid class name */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public abstract class C$AutoValue_SuperpackManifest extends com.google.android.libraries.micore.superpacks.SuperpackManifest {
    public final java.lang.String a;
    public final int b;
    public final defpackage.aigf c;

    public C$AutoValue_SuperpackManifest(java.lang.String str, int i, defpackage.aigf aigfVar, defpackage.aigf aigfVar2) {
        this.a = str;
        this.b = i;
        if (aigfVar == null) {
            throw new java.lang.NullPointerException("Null extraMap");
        }
        if (aigfVar2 == null) {
            throw new java.lang.NullPointerException("Null packs");
        }
        this.c = aigfVar2;
    }

    @Override // com.google.android.libraries.micore.superpacks.SuperpackManifest
    public final int a() {
        return this.b;
    }

    @Override // com.google.android.libraries.micore.superpacks.SuperpackManifest
    public final defpackage.aigf b() {
        return this.c;
    }

    @Override // com.google.android.libraries.micore.superpacks.SuperpackManifest
    public final java.lang.String c() {
        return this.a;
    }
}
