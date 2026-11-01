package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class wcb implements defpackage.znv {
    public final aoss a;
    public final defpackage.wce b;
    private final zjm c;

    public wcb(zjm zjmVar, aoss aossVar, defpackage.wce wceVar) {
        aooh.f(aossVar, "lightweightScope");
        aooh.f(wceVar, "siestaDataSender");
        this.c = zjmVar;
        this.a = aossVar;
        this.b = wceVar;
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [aonj, java.lang.Object] */
    @Override // defpackage.znv
    public final ajcq ej() {
        j$.util.Optional optionalG = this.c.g();
        defpackage.vxc vxcVar = new defpackage.vxc(new tge(this, 15), 9);
        if (true == optionalG.isPresent()) {
            vxcVar.a.a(optionalG.get());
        }
        return ajcm.a;
    }
}
