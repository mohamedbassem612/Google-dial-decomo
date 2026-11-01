package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class knj implements android.view.View.OnClickListener {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;
    public final /* synthetic */ java.lang.Object c;

    public /* synthetic */ knj(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    /* JADX WARN: Type inference failed for: r1v18, types: [android.view.View$OnClickListener, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object, oqx] */
    /* JADX WARN: Type inference failed for: r9v36, types: [java.lang.Object, rlv] */
    /* JADX WARN: Type inference failed for: r9v44, types: [android.view.View$OnClickListener, java.lang.Object] */
    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        switch (this.$cid) {
            case 0:
                this.a.e();
                ((defpackage.abxx) this.c).dismiss();
                break;
            case 1:
                boolean zBooleanValue = ((java.lang.Boolean) this.c).booleanValue();
                java.lang.Object obj = this.a;
                java.lang.Object obj2 = this.b;
                if (zBooleanValue) {
                    defpackage.kis kisVar = ((kiu) obj2).u;
                    if (kisVar == null) {
                        kisVar = defpackage.kis.a;
                    }
                    ((defpackage.kjd) obj).c(java.lang.String.valueOf(kisVar.d.get(0)));
                    break;
                } else {
                    defpackage.kis kisVar2 = ((kiu) obj2).u;
                    if (kisVar2 == null) {
                        kisVar2 = defpackage.kis.a;
                    }
                    java.lang.String str = (java.lang.String) kisVar2.c.get(0);
                    if (str != null && str.length() != 0) {
                        ((defpackage.kjd) obj).c(str);
                        break;
                    }
                }
                break;
            case 2:
                ((defpackage.mai) this.c).a.b((android.view.View) this.b, ((defpackage.mah) this.a).b);
                break;
            case 3:
                mau.a.b().l("com/android/dialer/conversationhistoryutil/ConversationHistoryActionProvider", "createDoNotScreenAction", 577, "ConversationHistoryActionProvider.java").v("do-not-screen action clicked");
                mau mauVar = (mau) this.c;
                mauVar.c.o(rmx.kF);
                java.lang.Object obj3 = this.a;
                j$.util.Optional optionalEmpty = j$.util.Optional.empty();
                kiu kiuVar = (kiu) obj3;
                defpackage.kis kisVar3 = kiuVar.u;
                if (kisVar3 == null) {
                    kisVar3 = defpackage.kis.a;
                }
                if (kisVar3.d.size() > 0) {
                    defpackage.kis kisVar4 = kiuVar.u;
                    if (kisVar4 == null) {
                        kisVar4 = defpackage.kis.a;
                    }
                    optionalEmpty = j$.util.Optional.of(java.lang.Long.valueOf(kisVar4.d.a(0)));
                }
                j$.util.Optional optional = optionalEmpty;
                mnp mnpVar = (mnp) mauVar.h.g().orElseThrow(new defpackage.iaz(15));
                defpackage.hkd hkdVar = kiuVar.f;
                if (hkdVar == null) {
                    hkdVar = defpackage.hkd.a;
                }
                java.lang.String str2 = hkdVar.c;
                defpackage.hkd hkdVar2 = kiuVar.f;
                if (hkdVar2 == null) {
                    hkdVar2 = defpackage.hkd.a;
                }
                java.lang.Object obj4 = this.b;
                aeqx aeqxVar = mauVar.g;
                java.lang.String str3 = hkdVar2.d;
                java.lang.String string = aeqxVar.d(kiuVar, true).toString();
                akzx akzxVarM = rmy.a.m();
                akzxVarM.u();
                rmy rmyVar = akzxVarM.b;
                rmyVar.c = 1;
                rmyVar.b |= 1;
                mnpVar.f(str2, str3, string, akzxVarM.p(), optional).r(((az) obj4).a(), "dobby_do_not_screen_dialog");
                break;
            case 4:
                pbh pbhVar = (pbh) this.a;
                pat patVar = pbhVar.b;
                pbhVar.l.i(patVar.c).b(mce.at);
                ahvr.j(new paw(patVar.c, (java.lang.String) this.c), (android.view.View) this.b);
                break;
            case 5:
                rap rapVarC = ((rdk) this.a).c((java.lang.String) this.c);
                if (rapVarC != null) {
                    java.lang.Object obj5 = this.b;
                    qub qubVar = (qub) rapVarC.f.get(obj5);
                    if (qubVar != null) {
                        qubVar.b(view);
                    } else {
                        rap.a.b().l("com/android/dialer/incall/voice/service/VoiceController", "onSnackbarActionTextClicked", 217, "VoiceController.java").y("Listener for %s not injected to CallScopeComponent.", ((qtz) obj5).name());
                    }
                } else {
                    rdk.a.d().i(zct.b).l("com/android/dialer/incall/voice/ui/VoiceFragmentPeer", "createSnackbar$<anonymous>", 2126, "VoiceFragmentPeer.kt").v("controller is not available.");
                }
                break;
            case 6:
                ((taq) this.a).a.o(rmx.cz);
                new afpl((android.app.Activity) this.b).N(((com.google.android.gms.googlehelp.GoogleHelp) this.c).a());
                break;
            case 7:
                if (this.b != null) {
                    java.lang.Object obj6 = this.c;
                    java.lang.Object obj7 = this.a;
                    aooh.f(obj7, "model");
                    java.lang.Object obj8 = ((aljf) obj6).d;
                    aooh.f(obj8, "view");
                    pgh pghVar = new pgh(((abpg) obj7).a);
                    aooh.f(obj8, "<this>");
                    ahvr.j(pghVar, (android.view.View) obj8);
                }
                break;
            case 8:
                ?? r9 = this.b;
                if (r9 != 0) {
                    r9.onClick((android.view.View) this.a);
                }
                ((alic) this.c).c();
                break;
            case 9:
                apdh apdhVar = new apdh();
                ((aflq) this.a).a = null;
                afky afkyVar = (afky) this.b;
                afkyVar.j(afkyVar.d, afkyVar.k, afkyVar.h, afjz.l(afkyVar.f));
                afkyVar.b.dismissAllowingStateLoss();
                aehj.D(apdhVar, afkyVar.d, (java.lang.String) this.c);
                break;
            case 10:
                apdh apdhVar2 = new apdh();
                ((aflh) this.a).a = null;
                afky afkyVar2 = (afky) this.b;
                afkyVar2.j(afkyVar2.d, afkyVar2.k, afkyVar2.h, afjz.l(afkyVar2.f));
                afkyVar2.b.dismissAllowingStateLoss();
                aehj.D(apdhVar2, afkyVar2.d, (java.lang.String) this.c);
                break;
            case 11:
                apdh apdhVar3 = new apdh();
                this.b.onClick(view);
                aehj.E(apdhVar3, ((afky) this.a).d, (java.lang.String) this.c);
                break;
            default:
                apdh apdhVar4 = new apdh();
                ((afkk) this.b).c = null;
                afky afkyVar3 = (afky) this.a;
                afkyVar3.j(afkyVar3.d, afkyVar3.k, afkyVar3.h, afjz.l(afkyVar3.f));
                afkyVar3.b.dismissAllowingStateLoss();
                aehj.D(apdhVar4, afkyVar3.d, (java.lang.String) this.c);
                break;
        }
    }

    public /* synthetic */ knj(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, int i, byte[] bArr) {
        this.$cid = i;
        this.c = obj;
        this.b = obj2;
        this.a = obj3;
    }

    public /* synthetic */ knj(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, int i, char[] cArr) {
        this.$cid = i;
        this.b = obj;
        this.a = obj2;
        this.c = obj3;
    }

    public /* synthetic */ knj(java.lang.Object obj, java.lang.String str, java.lang.Object obj2, int i) {
        this.$cid = i;
        this.a = obj;
        this.c = str;
        this.b = obj2;
    }

    public /* synthetic */ knj(mau mauVar, kiu kiuVar, az azVar, int i) {
        this.$cid = i;
        this.c = mauVar;
        this.a = kiuVar;
        this.b = azVar;
    }
}
