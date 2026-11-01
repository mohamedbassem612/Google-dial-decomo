package com.google.android.libraries.micore.superpacks.common;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class AutoValue_PackManifest extends com.google.android.libraries.micore.superpacks.common.C$AutoValue_PackManifest {
    public volatile transient java.lang.String i;
    private volatile transient defpackage.adhv m;
    private volatile transient defpackage.adhw n;

    @Override // com.google.android.libraries.micore.superpacks.common.PackManifest
    public final defpackage.adhv o() {
        if (this.m == null) {
            synchronized (this) {
                if (this.m == null) {
                    this.m = super.o();
                    if (this.m == null) {
                        throw new java.lang.NullPointerException("extras() cannot return null");
                    }
                }
            }
        }
        return this.m;
    }

    @Override // com.google.android.libraries.micore.superpacks.common.PackManifest
    public final defpackage.adhw p() {
        if (this.n == null) {
            synchronized (this) {
                if (this.n == null) {
                    this.n = super.p();
                    if (this.n == null) {
                        throw new java.lang.NullPointerException("qualifiedName() cannot return null");
                    }
                }
            }
        }
        return this.n;
    }
}
