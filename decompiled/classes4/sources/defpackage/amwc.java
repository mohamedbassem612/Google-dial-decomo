package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class amwc implements defpackage.amur {
    private final defpackage.amvy a = new defpackage.amvy();

    @Override // defpackage.amur
    public final defpackage.amvb a(java.lang.String str, defpackage.amun amunVar, int i) {
        if (amunVar == defpackage.amun.o) {
            return this.a.a("0".concat(java.lang.String.valueOf(str)), defpackage.amun.h, i);
        }
        throw new java.lang.IllegalArgumentException("Can only encode UPC-A, but got ".concat(amunVar.toString()));
    }
}
