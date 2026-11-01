package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public abstract class airl implements defpackage.airr {
    public final defpackage.airq a(byte[] bArr) {
        return d(bArr, bArr.length);
    }

    @Override // defpackage.airr
    public defpackage.airq b(java.lang.CharSequence charSequence, java.nio.charset.Charset charset) {
        return e().i(charSequence, charset).o();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [boolean, int] */
    public final defpackage.airs c(int i) {
        defpackage.ahvr.bP((i ^ (-1)) >>> 31, "expectedInputSize must be >= 0 but was %s", i);
        return e();
    }

    public defpackage.airq d(byte[] bArr, int i) {
        defpackage.ahvr.bX(0, i, bArr.length);
        defpackage.airs airsVarC = c(i);
        airsVarC.g(bArr, i);
        return airsVarC.o();
    }
}
