package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class icz implements ajat {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ boolean a;
    public final /* synthetic */ java.lang.Object b;

    public /* synthetic */ icz(java.lang.Object obj, boolean z, int i) {
        this.$cid = i;
        this.b = obj;
        this.a = z;
    }

    public final ajcq a(java.lang.Object obj) {
        java.lang.Object objY;
        java.lang.Object objY2;
        int i = 3;
        int i2 = 0;
        int i3 = 1;
        switch (this.$cid) {
            case 0:
                java.lang.Object obj2 = this.b;
                j$.util.Optional optionalOfNullable = (j$.util.Optional) obj;
                defpackage.idg idgVar = new defpackage.idg((defpackage.idh) obj2, this.a, i2);
                if (true == optionalOfNullable.isPresent()) {
                    java.lang.Object obj3 = optionalOfNullable.get();
                    java.lang.Object obj4 = idgVar.b;
                    boolean z = idgVar.a;
                    ((defpackage.idh) obj4).e.a(qbc.hs);
                    optionalOfNullable = j$.util.Optional.ofNullable(((defpackage.iax) obj3).h(z));
                }
                defpackage.idb idbVar = new defpackage.idb(obj2, i3);
                if (true != optionalOfNullable.isPresent()) {
                    ((defpackage.idh) idbVar.a).e.a(qbc.hr);
                    objY = aiql.y(new defpackage.hxd("trying to mute upload of an inactive call"));
                } else {
                    objY = optionalOfNullable.get();
                }
                return (ajcq) objY;
            case 1:
                java.lang.Object obj5 = this.b;
                j$.util.Optional optionalOfNullable2 = (j$.util.Optional) obj;
                defpackage.idg idgVar2 = new defpackage.idg((defpackage.idh) obj5, this.a, i3);
                if (true == optionalOfNullable2.isPresent()) {
                    java.lang.Object obj6 = optionalOfNullable2.get();
                    java.lang.Object obj7 = idgVar2.b;
                    boolean z2 = idgVar2.a;
                    ((defpackage.idh) obj7).e.a(qbc.hs);
                    optionalOfNullable2 = j$.util.Optional.ofNullable(((defpackage.iax) obj6).g(z2));
                }
                defpackage.idb idbVar2 = new defpackage.idb(obj5, i);
                if (true != optionalOfNullable2.isPresent()) {
                    ((defpackage.idh) idbVar2.a).e.a(qbc.hr);
                    objY2 = aiql.y(new defpackage.hxd("trying to mute download of an inactive call"));
                } else {
                    objY2 = optionalOfNullable2.get();
                }
                return (ajcq) objY2;
            case 2:
                rwx rwxVar = (rwx) this.b;
                agui aguiVar = (agui) obj;
                boolean zBooleanValue = ((java.lang.Boolean) rwxVar.b.a()).booleanValue();
                boolean z3 = this.a;
                if (zBooleanValue) {
                    rwx.a.c().k(aguiVar).l("com/android/dialer/notification/missedcalls/MissedCallDataSource", "getNewMissedCallsInternal", 202, "MissedCallDataSource.java").v(true == z3 ? "Error querying system call log for missed calls with missed reason" : "Error querying system call log for missed calls without missed reason");
                } else {
                    rwx.a.c().i(zct.b).k(aguiVar).l("com/android/dialer/notification/missedcalls/MissedCallDataSource", "getNewMissedCallsInternal", 212, "MissedCallDataSource.java").v(true == z3 ? "Error querying system call log for missed calls with missed reason" : "Error querying system call log for missed calls without missed reason");
                }
                rwxVar.e.i((java.lang.String) null).a(mcd.e);
                return z3 ? rwxVar.a(true) : aiql.z(j$.util.Optional.empty());
            case 3:
                boolean z4 = this.a;
                java.lang.Object obj8 = this.b;
                if (z4) {
                    return ((szs) obj8).l.c(defpackage.lgq.d);
                }
                szs szsVar = (szs) obj8;
                return ahvr.I(szsVar.i.b(szsVar.k), new szq(szsVar, 12), szsVar.e);
            case 4:
                if (!this.a) {
                    return ajcm.a;
                }
                java.lang.Object obj9 = this.b;
                xbk.a.b().l("com/android/incallui/atlas/ui/impl/tidepods/modeleventlistener/HoldForMeModelEventListener", "transitionToConnectingState", 188, "HoldForMeModelEventListener.java").v("transition to connecting state");
                xbk xbkVar = (xbk) obj9;
                ahvr.bY(xbkVar.p.isPresent());
                ahvr.bY(xbkVar.q.isPresent());
                ahrv ahrvVarG = ahrv.g((ajcq) xbkVar.q.orElseThrow());
                wyv wyvVar = new wyv(obj9, 9);
                ajcu ajcuVar = xbkVar.j;
                return ahrvVarG.i(wyvVar, ajcuVar).i(new wyv(obj9, 10), ajcuVar).i(new wyv(obj9, 11), ajcuVar).f(java.lang.Throwable.class, new wyv(obj9, 12), ajcuVar).h(new wzj(15), ajcuVar);
            case 5:
                java.lang.Object obj10 = this.b;
                xbs xbsVar = (xbs) obj10;
                defpackage.ibd ibdVar = xbsVar.e;
                ajcq ajcqVarB = ibdVar.b();
                ajcq ajcqVarC = ibdVar.c();
                return ahvr.ak(new ajcq[]{ajcqVarB, ajcqVarC}).p(new qwf(obj10, ajcqVarB, ajcqVarC, this.a, 4), xbsVar.c);
            case 6:
                if (!this.a) {
                    return ajcm.a;
                }
                xca xcaVar = ((xcy) this.b).k;
                return xcaVar.i.e(ahqx.b(new xbw(xcaVar, 3)), xcaVar.b);
            case 7:
                acwx acwxVar = (acwx) this.b;
                return acwxVar.d.b(this.a, acwxVar.i);
            default:
                acwx acwxVar2 = (acwx) this.b;
                return acwxVar2.d.b(this.a, acwxVar2.i);
        }
    }
}
