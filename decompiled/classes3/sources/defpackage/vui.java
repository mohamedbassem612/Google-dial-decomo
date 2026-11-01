package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class vui implements java.util.function.Consumer {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ boolean a;
    public final /* synthetic */ java.lang.Object b;
    public final /* synthetic */ java.lang.Object c;

    public /* synthetic */ vui(mau mauVar, kgu kguVar, boolean z, int i) {
        this.$cid = i;
        this.c = mauVar;
        this.b = kguVar;
        this.a = z;
    }

    @Override // java.util.function.Consumer
    public final void accept(java.lang.Object obj) {
        if (this.$cid != 0) {
            kgz kgzVar = (kgz) obj;
            boolean zBooleanValue = ((java.lang.Boolean) ((mau) this.c).f.a()).booleanValue();
            java.lang.Object obj2 = this.b;
            if (!zBooleanValue) {
                kgzVar.g(((kgu) obj2).i, 1);
                return;
            } else {
                kgzVar.g(((kgu) obj2).c, true != this.a ? 2 : 3);
                return;
            }
        }
        defpackage.vtt vttVar = (defpackage.vtt) obj;
        akzx akzxVarM = defpackage.vtu.a.m();
        akzxVarM.u();
        defpackage.vtu vtuVar = (defpackage.vtu) akzxVarM.b;
        vtuVar.b |= 2;
        vtuVar.d = this.a;
        akzxVarM.u();
        defpackage.vtu vtuVar2 = (defpackage.vtu) akzxVarM.b;
        j$.util.Objects.requireNonNull(vttVar);
        vtuVar2.c = vttVar;
        vtuVar2.b |= 1;
        j$.util.Optional optionalOf = j$.util.Optional.of(vttVar);
        defpackage.vuk vukVar = (defpackage.vuk) this.b;
        defpackage.vul vulVar = vukVar.b;
        ajcq ajcqVarB = vulVar.c.b(optionalOf, false);
        ajcq ajcqVarD = vulVar.l.d(vttVar);
        aooh.f(vttVar, "voicemailAccount");
        boolean z = vukVar.a;
        defpackage.vvk vvkVar = vulVar.n;
        ajcq ajcqVarF = aosv.F(vvkVar.d, 0, new defpackage.vvg(vttVar, vvkVar, z, null), 3);
        ((aift) this.c).i(ahvr.af(new ajcq[]{ajcqVarB, ajcqVarD, ajcqVarF}).e(new joq(akzxVarM, ajcqVarB, ajcqVarD, ajcqVarF, 18), vulVar.d));
    }

    @Override // java.util.function.Consumer
    public final /* synthetic */ java.util.function.Consumer andThen(java.util.function.Consumer consumer) {
        return this.$cid != 0 ? j$.util.function.Consumer.-CC.$default$andThen(this, consumer) : j$.util.function.Consumer.-CC.$default$andThen(this, consumer);
    }

    public /* synthetic */ vui(defpackage.vuk vukVar, aift aiftVar, boolean z, int i) {
        this.$cid = i;
        this.b = vukVar;
        this.c = aiftVar;
        this.a = z;
    }
}
