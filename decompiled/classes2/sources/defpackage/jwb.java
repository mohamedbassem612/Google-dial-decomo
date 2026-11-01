package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class jwb implements zoi {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public jwb(defpackage.jwd jwdVar, int i) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(jwdVar);
        this.a = jwdVar;
    }

    public final void eh() {
        int i = 14;
        int i2 = 11;
        switch (this.$cid) {
            case 0:
                defpackage.jwd jwdVar = (defpackage.jwd) this.a;
                ahrv ahrvVarG = ahrv.g(jwdVar.c.a());
                defpackage.hky hkyVar = new defpackage.hky(this, i2);
                ajct ajctVar = jwdVar.e;
                agsm.i(179, ahrvVarG.i(hkyVar, ajctVar).h(new defpackage.jss(this, 9), ajctVar), "Unable to insert CallingNetworks data", new java.lang.Object[0]);
                break;
            case 1:
                defpackage.hxv hxvVar = (defpackage.hxv) this.a;
                aoov.an(hxvVar.c, (aolr) null, 0, new defpackage.hqt(hxvVar, (aoln) null, 2), 3).p(new defpackage.guv(i2));
                break;
            case 2:
                defpackage.lev levVar = (defpackage.lev) this.a;
                agsm.i(267, levVar.y.B(levVar.m), "failed to remove call id from tracker", new java.lang.Object[0]);
                break;
            case 3:
                aenj aenjVar = new aenj("onDobbyCallScopeRemoved");
                defpackage.nej nejVar = (defpackage.nej) this.a;
                nejVar.U(aenjVar);
                nejVar.X(aenjVar);
                defpackage.nej.a.b().l("com/android/dialer/dobby/impl/service/DobbyLifecycleController", "onDobbyCallScopeRemoved", 884, "DobbyLifecycleController.kt").v("NGCS.onCallScopeRemoved Immediate");
                nejVar.S(ruc.aY, new defpackage.kqu(nejVar, (aoln) null, 14, (byte[]) null));
                break;
            case 4:
                aimz aimzVar = zih.a;
                aolr aolrVarPlus = zih.b.plus(aols.a);
                defpackage.ocu ocuVar = (defpackage.ocu) this.a;
                aoov.al(ocuVar.d, aolrVarPlus, 1, new defpackage.loe((aoln) null, ocuVar, 15));
                break;
            case 5:
                pqm pqmVar = (pqm) this.a;
                agsm.i(501, pqmVar.j(pqmVar.g), "failed to reset answer completers in onCallScopeRemoved", new java.lang.Object[0]);
                agsm.i(502, pqmVar.j(pqmVar.h), "failed to reset disconnect completers in onCallScopeRemoved", new java.lang.Object[0]);
                agsm.i(503, pqmVar.j(pqmVar.i), "failed to reset unhold completers in onCallScopeRemoved", new java.lang.Object[0]);
                break;
            case 6:
                ((qax) this.a).e.b(ruc.aH);
                break;
            case 7:
                aimw aimwVarL = qdq.a.b().l("com/android/dialer/incall/proximitysensor/impl/incall/InCallProximityCallScopedController", "onCallScopeRemoved", 49, "InCallProximityCallScopedController.java");
                qdq qdqVar = (qdq) this.a;
                java.lang.String str = qdqVar.f;
                aimwVarL.y("unregistering %s from DisplayStateTracker and AccelerometerTracker.", str);
                qdp qdpVar = qdqVar.d;
                agsm.i(589, ahvr.E(new pmw(qdpVar, str, 12, (byte[]) null), qdpVar.b), "Failed to unregister %s from DisplayStateTracker.", new java.lang.Object[]{str});
                qdo qdoVar = qdqVar.e;
                defpackage.lly llyVar = new defpackage.lly(qdoVar, str, 20);
                java.util.concurrent.Executor executor = qdoVar.d;
                agsm.i(590, ahvr.I(ahvr.F(llyVar, executor), new defpackage.ocj(qdoVar, i), executor), "Failed to unregister %s from AccelerometerTracker.", new java.lang.Object[]{str});
                break;
            case 8:
                she sheVar = (she) this.a;
                aoov.an(sheVar.b, (aolr) null, 0, new sge(sheVar, (aoln) null, 5, (char[]) null), 3);
                break;
            case 9:
                aimz aimzVar2 = uws.a;
                aimzVar2.b().l("com/android/dialer/transcriptaudiofeedback/impl/notification/FeedbackNotificationController", "onCallScopeRemoved", 75, "FeedbackNotificationController.java").v("Call scope removed");
                java.lang.Object obj = this.a;
                uws uwsVar = (uws) obj;
                if (uwsVar.i.C() <= ((java.lang.Double) uwsVar.e.a()).doubleValue()) {
                    defpackage.uwr uwrVar = (defpackage.uwr) aooc.ar(uwsVar.j.Y(), defpackage.uwr.class);
                    ajcq ajcqVarBO = uwrVar.bO();
                    ajcq ajcqVarBh = uwrVar.bh();
                    long j = uwsVar.d;
                    zzx zzxVar = uwsVar.h;
                    aigf aigfVarF = defpackage.aitt.k(zzxVar.k()).c(new uwq(j, 0)).f();
                    aigf aigfVarF2 = defpackage.aitt.k(zzxVar.k()).c(new uwq(j, 2)).f();
                    ahda ahdaVarAk = ahvr.ak(new ajcq[]{aiql.v(aigfVarF.c()), aiql.v(aigfVarF2.c())});
                    uwl uwlVar = new uwl(aigfVarF, aigfVarF2, 2);
                    ajct ajctVar2 = uwsVar.c;
                    ajcq ajcqVarO = ahdaVarAk.o(uwlVar, ajctVar2);
                    agsm.i(957, ahvr.ak(new ajcq[]{ajcqVarBO, ajcqVarBh, ajcqVarO}).p(new defpackage.kff(obj, (java.lang.Object) ajcqVarBO, ajcqVarBh, ajcqVarO, 13), ajctVar2), "Could not post notification", new java.lang.Object[0]);
                } else {
                    aimzVar2.b().l("com/android/dialer/transcriptaudiofeedback/impl/notification/FeedbackNotificationController", "onCallScopeRemoved", 78, "FeedbackNotificationController.java").v("notification suppressed");
                }
                break;
            default:
                zqu zquVar = (zqu) this.a;
                aoov.an(zquVar.d, (aolr) null, 0, new zqs(zquVar, (aoln) null, 3, (short[]) null), 3);
                break;
        }
    }

    public /* synthetic */ jwb(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    public jwb(qax qaxVar, int i) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(qaxVar);
        this.a = qaxVar;
    }
}
