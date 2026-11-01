package com.google.android.libraries.micore.superpacks.base;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class AutoValue_VersionedName extends com.google.android.libraries.micore.superpacks.base.C$AutoValue_VersionedName {
    private volatile transient java.lang.String c;

    @Override // com.google.android.libraries.micore.superpacks.base.VersionedName
    public final java.lang.String toString() {
        if (this.c == null) {
            synchronized (this) {
                if (this.c == null) {
                    this.c = super.toString();
                    if (this.c == null) {
                        throw new java.lang.NullPointerException("toString() cannot return null");
                    }
                }
            }
        }
        return this.c;
    }
}
