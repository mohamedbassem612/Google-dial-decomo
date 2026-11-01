package com.google.android.libraries.micore.superpacks;

/* JADX INFO: renamed from: com.google.android.libraries.micore.superpacks.$AutoValue_SlicingResult, reason: invalid class name */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public abstract class C$AutoValue_SlicingResult extends com.google.android.libraries.micore.superpacks.SlicingResult {
    public final defpackage.aify a;
    public final boolean b;
    public final byte[] c;

    public C$AutoValue_SlicingResult(defpackage.aify aifyVar, boolean z, byte[] bArr) {
        if (aifyVar == null) {
            throw new java.lang.NullPointerException("Null slices");
        }
        this.a = aifyVar;
        this.b = z;
        this.c = bArr;
    }

    @Override // com.google.android.libraries.micore.superpacks.SlicingResult
    public final defpackage.aify a() {
        return this.a;
    }

    @Override // com.google.android.libraries.micore.superpacks.SlicingResult
    public final boolean b() {
        return this.b;
    }

    @Override // com.google.android.libraries.micore.superpacks.SlicingResult
    public final byte[] c() {
        return this.c;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof com.google.android.libraries.micore.superpacks.SlicingResult) {
            com.google.android.libraries.micore.superpacks.SlicingResult slicingResult = (com.google.android.libraries.micore.superpacks.SlicingResult) obj;
            if (defpackage.ahvr.aP(this.a, slicingResult.a()) && this.b == slicingResult.b()) {
                if (java.util.Arrays.equals(this.c, slicingResult instanceof com.google.android.libraries.micore.superpacks.C$AutoValue_SlicingResult ? ((com.google.android.libraries.micore.superpacks.C$AutoValue_SlicingResult) slicingResult).c : slicingResult.c())) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231)) * 1000003) ^ java.util.Arrays.hashCode(this.c);
    }
}
