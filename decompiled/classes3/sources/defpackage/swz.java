package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class swz implements defpackage.qbb {
    private final long a;
    private final tbm b;

    public swz(long j, tbm tbmVar) {
        this.a = j;
        this.b = tbmVar;
    }

    @Override // defpackage.qbb
    public final ajcq a() {
        return this.b.a(this.a);
    }

    @Override // defpackage.qbb
    public final /* synthetic */ void b(akzx akzxVar, java.lang.Object obj) {
        j$.util.Optional optional = (j$.util.Optional) obj;
        j$.util.Objects.requireNonNull(akzxVar);
        defpackage.rhb rhbVar = new defpackage.rhb(akzxVar, 16);
        if (true == optional.isPresent()) {
            defpackage.amrf amrfVar = (defpackage.amrf) optional.get();
            akzx akzxVar2 = (akzx) rhbVar.a;
            akzxVar2.u();
            amow amowVar = akzxVar2.b;
            amow amowVar2 = amow.a;
            j$.util.Objects.requireNonNull(amrfVar);
            amowVar.M = amrfVar;
            amowVar.c |= 4096;
        }
    }
}
