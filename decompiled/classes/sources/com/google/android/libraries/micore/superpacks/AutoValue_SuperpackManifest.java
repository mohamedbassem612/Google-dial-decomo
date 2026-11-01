package com.google.android.libraries.micore.superpacks;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class AutoValue_SuperpackManifest extends com.google.android.libraries.micore.superpacks.C$AutoValue_SuperpackManifest {
    private volatile transient com.google.android.libraries.micore.superpacks.base.VersionedName d;
    private volatile transient java.lang.String e;

    @Override // com.google.android.libraries.micore.superpacks.SuperpackManifest
    public final com.google.android.libraries.micore.superpacks.base.VersionedName d() {
        if (this.d == null) {
            synchronized (this) {
                if (this.d == null) {
                    this.d = super.d();
                    if (this.d == null) {
                        throw new java.lang.NullPointerException("versionedName() cannot return null");
                    }
                }
            }
        }
        return this.d;
    }

    @Override // com.google.android.libraries.micore.superpacks.SuperpackManifest
    public final java.lang.String toString() {
        if (this.e == null) {
            synchronized (this) {
                if (this.e == null) {
                    this.e = super.toString();
                    if (this.e == null) {
                        throw new java.lang.NullPointerException("toString() cannot return null");
                    }
                }
            }
        }
        return this.e;
    }
}
