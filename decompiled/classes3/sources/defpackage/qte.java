package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class qte implements ahtl {
    final /* synthetic */ defpackage.qtd a;

    public qte(defpackage.qtd qtdVar) {
        this.a = qtdVar;
    }

    public final /* synthetic */ defpackage.ahtm a(ahth ahthVar) {
        defpackage.qmy qmyVar = ((defpackage.qtc) ahthVar).a;
        aimw aimwVarL = defpackage.qtd.b.b().l("com/android/dialer/incall/video/ui/VideoScreenFragmentPeer", "onVideoButtonClickedEvent", 658, "VideoScreenFragmentPeer.java");
        defpackage.qmz qmzVar = qmyVar.a;
        aimwVarL.y("button (%s) is clicked", qmzVar.name());
        defpackage.qtd qtdVar = this.a;
        if (qmzVar == defpackage.qmz.BUTTON_ADD_CALL) {
            if (qmyVar.e.d) {
                defpackage.qry qryVar = new defpackage.qry();
                amxr.g(qryVar);
                qryVar.r(qtdVar.d.I(), "add_call_prompt_dialog");
                j$.util.Optional optionalK = qtdVar.k();
                if (true == optionalK.isPresent()) {
                    defpackage.qrv qrvVar = (defpackage.qrv) optionalK.get();
                    defpackage.qrv.a.b().l("com/android/dialer/incall/video/service/VideoScreenController", "onDialogShown", 404, "VideoScreenController.java").v("onDialogShown");
                    qrvVar.f.a(true);
                    qrvVar.e.a();
                }
            } else if (qtdVar.j.isKeyguardLocked()) {
                qtdVar.r();
            } else {
                j$.util.Optional optionalK2 = qtdVar.k();
                if (true == optionalK2.isPresent()) {
                    ((defpackage.qrv) optionalK2.get()).c();
                }
            }
            return defpackage.ahtm.a;
        }
        if (qmzVar == defpackage.qmz.BUTTON_CAMERA_OFF && qmyVar.e.d) {
            qtdVar.q();
        }
        if (qmzVar == defpackage.qmz.BUTTON_MERGE) {
            defpackage.qsj qsjVar = new defpackage.qsj();
            amxr.g(qsjVar);
            qsjVar.r(qtdVar.d.I(), "merge_calls_prompt_dialog");
            j$.util.Optional optionalK3 = qtdVar.k();
            if (true == optionalK3.isPresent()) {
                defpackage.qrv qrvVar2 = (defpackage.qrv) optionalK3.get();
                defpackage.qrv.a.b().l("com/android/dialer/incall/video/service/VideoScreenController", "onDialogShown", 404, "VideoScreenController.java").v("onDialogShown");
                qrvVar2.f.a(true);
                qrvVar2.e.a();
            }
            return defpackage.ahtm.a;
        }
        if (qmzVar == defpackage.qmz.BUTTON_MANAGE_VIDEO_CONFERENCE) {
            j$.util.Optional optionalK4 = qtdVar.k();
            if (true == optionalK4.isPresent()) {
                ((defpackage.qrv) optionalK4.get()).e(qbc.bS);
            }
            mni.bZ().r(qtdVar.d.I(), "ManageConferenceDialog");
            return defpackage.ahtm.a;
        }
        if (qmyVar.e.c) {
            j$.util.Optional optionalOfNullable = qtdVar.l;
            if (true == optionalOfNullable.isPresent()) {
                optionalOfNullable = j$.util.Optional.ofNullable(java.lang.Boolean.valueOf(((defpackage.qqr) optionalOfNullable.get()).t));
            }
            if (((java.lang.Boolean) optionalOfNullable.orElse(java.lang.Boolean.FALSE)).booleanValue()) {
                qtdVar.q.b("android.permission.BLUETOOTH_CONNECT");
            }
            pez.j().r(qtdVar.d.I(), "AudioRouteSelectorDialog");
            j$.util.Optional optionalK5 = qtdVar.k();
            if (true == optionalK5.isPresent()) {
                defpackage.qrv qrvVar3 = (defpackage.qrv) optionalK5.get();
                defpackage.qrv.a.b().l("com/android/dialer/incall/video/service/VideoScreenController", "onDialogShown", 404, "VideoScreenController.java").v("onDialogShown");
                qrvVar3.f.a(true);
                qrvVar3.e.a();
            }
        }
        j$.util.Optional optionalK6 = qtdVar.k();
        defpackage.qmp qmpVar = new defpackage.qmp(qmyVar, 16);
        if (true == optionalK6.isPresent()) {
            java.lang.Object obj = optionalK6.get();
            java.lang.Object obj2 = qmpVar.a;
            defpackage.qrv qrvVar4 = (defpackage.qrv) obj;
            aigf aigfVarK = qrvVar4.u.k();
            defpackage.qmy qmyVar2 = (defpackage.qmy) obj2;
            defpackage.qmz qmzVar2 = qmyVar2.a;
            aoin aoinVar = (aoin) aigfVarK.get(qmzVar2);
            if (aoinVar == null) {
                throw new java.lang.IllegalStateException(java.lang.String.format("Listener for %s not injected to CallScopeComponent", qmzVar2.name()));
            }
            defpackage.qmw qmwVar = qmyVar2.e;
            qrvVar4.e.a();
            ((defpackage.qmx) aoinVar.a()).a(qmwVar);
        }
        return defpackage.ahtm.a;
    }
}
