package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
final class anut extends defpackage.anok {
    final defpackage.anoc a;
    final anns b;
    final anvf c;
    final anvg d;
    java.util.List e;
    defpackage.anyh f;
    boolean g;
    boolean h;
    final /* synthetic */ anzg i;
    defpackage.apjb j;

    public anut(anzg anzgVar, defpackage.anoc anocVar) {
        j$.util.Objects.requireNonNull(anzgVar);
        this.i = anzgVar;
        this.e = anocVar.a;
        this.a = anocVar;
        anns annsVarB = anns.b("Subchannel", anzgVar.a());
        this.b = annsVarB;
        anvg anvgVar = new anvg(annsVarB, anzgVar.m.a(), "Subchannel for ".concat(anocVar.a.toString()));
        this.d = anvgVar;
        this.c = new anvf(anvgVar, anzgVar.m);
    }

    @Override // defpackage.anok
    public final void a() {
        this.i.n.c();
        ahvr.bZ(this.g, "not started");
        if (this.h) {
            return;
        }
        this.f.a();
    }

    @Override // defpackage.anok
    public final void b() {
        defpackage.apjb apjbVar;
        anzg anzgVar = this.i;
        anrc anrcVar = anzgVar.n;
        anrcVar.c();
        if (this.f == null) {
            this.h = true;
            return;
        }
        if (!this.h) {
            this.h = true;
        } else {
            if (!anzgVar.D || (apjbVar = this.j) == null) {
                return;
            }
            apjbVar.j();
            this.j = null;
        }
        if (anzgVar.D) {
            this.f.h(anzg.c);
        } else {
            this.j = anrcVar.d(new defpackage.anyl(new defpackage.aoai(this, 1)), 5L, java.util.concurrent.TimeUnit.SECONDS, anzgVar.j.c());
        }
    }

    @Override // defpackage.anok
    public final void c(defpackage.anom anomVar) {
        anzg anzgVar = this.i;
        anrc anrcVar = anzgVar.n;
        anrcVar.c();
        ahvr.bZ(!this.g, "already started");
        ahvr.bZ(!this.h, "already shutdown");
        ahvr.bZ(!anzgVar.D, "Channel is being terminated");
        this.g = true;
        java.lang.String strA = anzgVar.a();
        anvv anvvVar = anzgVar.j;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorServiceC = anvvVar.c();
        defpackage.anyd anydVar = new defpackage.anyd(this, anomVar);
        anve anveVarA = anzgVar.F.a();
        anpm anpmVar = anzgVar.u.b.U;
        anns annsVar = this.b;
        anvf anvfVar = this.c;
        java.util.List list = anzgVar.q;
        defpackage.anoc anocVar = this.a;
        java.lang.String str = anzgVar.r;
        anno annoVar = anzgVar.J;
        defpackage.anyh anyhVar = new defpackage.anyh(anocVar, strA, str, anvvVar, scheduledExecutorServiceC, anrcVar, anydVar, annoVar, anveVarA, annsVar, anvfVar, list, anzgVar.i, anpmVar);
        annk annkVar = new annk();
        annkVar.a = "Child Subchannel started";
        annkVar.b = annl.b;
        annkVar.b(anzgVar.m.a());
        annkVar.c = anyhVar;
        anzgVar.H.b(annkVar.a());
        this.f = anyhVar;
        anno.b(annoVar.e, anyhVar);
        anzgVar.w.add(anyhVar);
    }

    @Override // defpackage.anok
    public final void d(java.util.List list) {
        this.i.n.c();
        this.e = list;
        defpackage.anyh anyhVar = this.f;
        ahvr.cj(list, "newAddressGroups");
        defpackage.anyh.b(list, "newAddressGroups contains null entry");
        ahvr.bN(!list.isEmpty(), "newAddressGroups is empty");
        anyhVar.g.execute(new defpackage.alvh(anyhVar, j$.util.DesugarCollections.unmodifiableList(new java.util.ArrayList(list)), 20));
    }

    public final java.lang.String toString() {
        return this.b.toString();
    }
}
