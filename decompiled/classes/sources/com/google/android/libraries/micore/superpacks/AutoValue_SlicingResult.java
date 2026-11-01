package com.google.android.libraries.micore.superpacks;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class AutoValue_SlicingResult extends com.google.android.libraries.micore.superpacks.C$AutoValue_SlicingResult {
    private volatile transient defpackage.aify d;
    private volatile transient java.lang.String e;

    @Override // com.google.android.libraries.micore.superpacks.SlicingResult
    public final defpackage.aify d() {
        defpackage.aify aifyVarG;
        if (this.d == null) {
            synchronized (this) {
                if (this.d == null) {
                    defpackage.aify aifyVar = this.a;
                    if (aifyVar.isEmpty()) {
                        aifyVarG = defpackage.aike.a;
                    } else {
                        int i = ((defpackage.aike) aifyVar).d;
                        defpackage.ahvr.bC(i, "expectedSize");
                        defpackage.aift aiftVar = new defpackage.aift(i);
                        for (int i2 = 0; i2 < i; i2++) {
                            aiftVar.i(((com.google.android.libraries.micore.superpacks.common.Slice) aifyVar.get(i2)).f());
                        }
                        aifyVarG = aiftVar.g();
                    }
                    this.d = aifyVarG;
                    if (this.d == null) {
                        throw new java.lang.NullPointerException("packManifests() cannot return null");
                    }
                }
            }
        }
        return this.d;
    }

    @Override // com.google.android.libraries.micore.superpacks.SlicingResult
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
