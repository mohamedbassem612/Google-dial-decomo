package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class hzv implements defpackage.hzi {
    private final defpackage.hzp a;
    private final defpackage.hzp b;
    private final defpackage.hzp c;
    private final defpackage.hzp d;
    private final defpackage.hzp e;
    private final defpackage.hzp f;
    private final defpackage.hzz g;
    private final aoin h;
    private final j$.util.Optional i = j$.util.Optional.empty();
    private final defpackage.jyn j;

    static {
        new android.media.AudioFormat.Builder().setEncoding(2).setChannelMask(4).setSampleRate(16000).build();
    }

    public hzv(defpackage.ifb ifbVar, defpackage.hzs hzsVar, defpackage.hzs hzsVar2, defpackage.hzs hzsVar3, defpackage.hzs hzsVar4, defpackage.hzs hzsVar5, defpackage.hzs hzsVar6, defpackage.hzz hzzVar, defpackage.jyn jynVar, aoin aoinVar) {
        this.a = ifbVar.c(hzsVar);
        this.b = ifbVar.c(hzsVar2);
        this.c = ifbVar.c(hzsVar3);
        this.d = ifbVar.c(hzsVar4);
        this.e = ifbVar.c(hzsVar5);
        this.f = ifbVar.c(hzsVar6);
        this.h = aoinVar;
        this.g = hzzVar;
        this.j = jynVar;
    }

    @Override // defpackage.hzi
    public final defpackage.hzl a(defpackage.hzh hzhVar) {
        int iOrdinal = hzhVar.ordinal();
        if (iOrdinal == 0) {
            return ((java.lang.Boolean) this.h.a()).booleanValue() ? this.b : this.a;
        }
        if (iOrdinal == 1) {
            return ((java.lang.Boolean) this.h.a()).booleanValue() ? this.f : this.e;
        }
        if (iOrdinal == 2) {
            return ((java.lang.Boolean) this.h.a()).booleanValue() ? this.d : this.c;
        }
        throw new java.lang.IllegalArgumentException();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v0, types: [aoin, java.lang.Object] */
    @Override // defpackage.hzi
    public final defpackage.hzm b(java.lang.Runnable runnable, java.util.function.Consumer consumer) {
        defpackage.jyn jynVar = this.j;
        defpackage.ibo iboVar = (defpackage.ibo) jynVar.a.a();
        iboVar.getClass();
        uss ussVar = (uss) jynVar.c.a();
        ussVar.getClass();
        rlv rlvVar = (rlv) jynVar.b.a();
        rlvVar.getClass();
        return new defpackage.hzx(runnable, consumer, jynVar.d, iboVar, ussVar, rlvVar);
    }

    @Override // defpackage.hzi
    public final defpackage.hzo c() {
        return this.g;
    }

    @Override // defpackage.hzi
    public final ajcq d() {
        this.i.isPresent();
        return ajcm.a;
    }
}
