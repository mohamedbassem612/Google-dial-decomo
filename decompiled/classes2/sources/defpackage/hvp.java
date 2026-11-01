package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class hvp implements java.util.function.Consumer {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;

    public /* synthetic */ hvp(java.lang.Object obj, java.lang.Object obj2, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Type inference failed for: r10v10, types: [geh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v27, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r9v38, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r9v39, types: [java.lang.Object, java.util.List] */
    @Override // java.util.function.Consumer
    public final void accept(java.lang.Object obj) {
        int i = 0;
        switch (this.$cid) {
            case 0:
                ((java.lang.StringBuilder) this.a).append(((defpackage.kvt) obj).e((j$.util.Optional) this.b));
                return;
            case 1:
                ((java.lang.StringBuilder) this.a).append(((ils) obj).a((j$.util.Optional) this.b));
                return;
            case 2:
                ((defpackage.idh) this.b).d.q((aeun) obj, (aenj) this.a, rub.c);
                return;
            case 3:
                ((defpackage.iok) this.a).e((android.content.Intent) this.b, (android.app.PendingIntent) obj);
                return;
            case 4:
                ?? r10 = ((defpackage.iyh) this.a).a;
                defpackage.jrw jrwVar = (defpackage.jrw) r10;
                if (jrwVar.e == null) {
                    defpackage.jrr jrrVar = jrwVar.g;
                    jrwVar.e = (androidx.preference.SwitchPreference) jrrVar.ee(jrrVar.dX().getString(2132017486));
                }
                java.lang.Object obj2 = this.b;
                androidx.preference.SwitchPreference switchPreference = jrwVar.e;
                defpackage.jrq jrqVar = (defpackage.jrq) obj2;
                boolean z = jrqVar.f;
                boolean z2 = jrqVar.g;
                if (z) {
                    switchPreference.n = r10;
                    switchPreference.k(z2);
                    return;
                } else {
                    jrwVar.g.dW().af(switchPreference);
                    defpackage.jrw.a.b().l("com/android/dialer/callerid/settings/impl/CallerIdSettingsFragmentPeer", "setupB2cEnrichedCallingSettings", 323, "CallerIdSettingsFragmentPeer.java").v("removing B2C EC settings as it is not supported");
                    switchPreference.k(false);
                    return;
                }
            case 5:
                boolean z3 = ((defpackage.jrq) this.b).i;
                java.lang.Object obj3 = this.a;
                if (!z3) {
                    defpackage.jrw jrwVar2 = (defpackage.jrw) ((defpackage.iyh) obj3).a;
                    jrwVar2.c.I(true);
                    jrwVar2.d.I(((androidx.preference.TwoStatePreference) jrwVar2.c).a);
                    return;
                }
                defpackage.jrw jrwVar3 = (defpackage.jrw) ((defpackage.iyh) obj3).a;
                jrwVar3.c.k(true);
                jrwVar3.c.I(false);
                jrwVar3.c.c = new defpackage.jrv(obj3, i);
                jrwVar3.d.k(true);
                jrwVar3.d.I(false);
                jrwVar3.d.c = new defpackage.jrv(obj3, 2);
                return;
            case 6:
                defpackage.kno.a.b().l("com/android/dialer/calllog/ui/menu/ConversationHistoryCallLogDropdownActions", "applyActionToButton", 542, "ConversationHistoryCallLogDropdownActions.java").v("set TikTok Events' onClick");
                defpackage.hgu.u((android.content.Context) this.b).nz().g((android.view.View) this.a, (ahth) obj);
                return;
            case 7:
                defpackage.kok kokVar = (defpackage.kok) obj;
                android.content.Context context = (android.content.Context) ((aeqx) this.b).b;
                java.lang.CharSequence text = context.getText(2132018195);
                java.lang.CharSequence[] charSequenceArr = new java.lang.CharSequence[1];
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                if (kokVar.b == 0 || kokVar.c == 0 || kokVar.d == 0) {
                    throw null;
                }
                aike aikeVar = kokVar.a;
                int i2 = aikeVar.d;
                for (int i3 = 0; i3 < i2; i3++) {
                    defpackage.koh kohVar = (defpackage.koh) aikeVar.get(i3);
                    if (kohVar != defpackage.koh.HD && kohVar != defpackage.koh.LTE && kohVar != defpackage.koh.WIFI) {
                        sb.append(context.getString(kohVar.k));
                        sb.append(',');
                    }
                }
                if (sb.length() > 0) {
                    sb.deleteCharAt(sb.length() - 1);
                }
                ?? r9 = this.a;
                charSequenceArr[0] = sb.toString();
                r9.add(android.text.TextUtils.expandTemplate(text, charSequenceArr));
                return;
            case 8:
                ((android.speech.tts.TextToSpeech) obj).synthesizeToFile("", (android.os.Bundle) this.b, (java.io.File) this.a, "dummytext");
                return;
            case 9:
                aify aifyVarZ = ((pgi) obj).z((defpackage.lll) this.b);
                akzx akzxVar = (akzx) this.a;
                akzxVar.u();
                defpackage.lex lexVar = (defpackage.lex) akzxVar.b;
                defpackage.lex lexVar2 = defpackage.lex.a;
                alat alatVar = lexVar.f;
                if (!alatVar.c()) {
                    lexVar.f = alad.J(alatVar);
                }
                akyl.i(aifyVarZ, lexVar.f);
                return;
            case 10:
                ((oyc) this.a).w.f((android.widget.ImageView) this.b, ((own) obj).g, false);
                return;
            case 11:
                this.a.add(ft$.ExternalSyntheticApiModelOutline0.m(ft$.ExternalSyntheticApiModelOutline0.m(ft$.ExternalSyntheticApiModelOutline0.m(new android.app.Person.Builder(), (java.lang.CharSequence) this.b), (java.lang.String) obj)));
                return;
            case 12:
                this.a.add(ft$.ExternalSyntheticApiModelOutline0.m(ft$.ExternalSyntheticApiModelOutline0.m(ft$.ExternalSyntheticApiModelOutline0.m(new android.app.Person.Builder(), (java.lang.CharSequence) this.b), android.net.Uri.fromParts("tel", (java.lang.String) obj, null).toString())));
                return;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                pnn pnnVar = (pnn) this.b;
                pnnVar.b.b.q((aeun) obj, ((java.util.concurrent.atomic.AtomicBoolean) pnnVar.d.a).get() ? ruc.Q : ruc.R, this.a instanceof java.util.concurrent.CancellationException ? rub.d : rub.c);
                return;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                pez.Y((android.text.SpannableString) this.b, (java.lang.String) this.a, ((java.lang.Integer) obj).intValue());
                return;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                pzo pzoVar = (pzo) obj;
                android.telecom.Call call = (android.telecom.Call) this.b;
                pzoVar.c(call, 11);
                puq puqVar = (puq) this.a;
                if (((java.lang.Boolean) puqVar.o.a()).booleanValue()) {
                    oko okoVar = puqVar.k;
                    android.net.Uri handle = call.getDetails().getHandle();
                    ahvr.J(okoVar.j(handle != null ? handle.getSchemeSpecificPart() : ""), new defpackage.kxp(puqVar, pzoVar, call, 7), puqVar.n);
                    return;
                }
                return;
            case 16:
                aimz aimzVar = pvf.a;
                ((android.telecom.InCallService.VideoCall) this.b).setPreviewSurface((android.view.Surface) this.a);
                return;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                pvf pvfVar = (pvf) this.a;
                pvfVar.s.e((android.util.Size) this.b);
                android.view.Surface surfaceA = pvfVar.r.a();
                pvfVar.q.a(defpackage.mfy.TELECOM_VIDEO_SET_PREVIEW_SURFACE);
                ((android.telecom.InCallService.VideoCall) obj).setPreviewSurface(surfaceA);
                return;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                java.lang.Object obj4 = this.b;
                if (((aw) obj).equals(obj4)) {
                    u uVar = new u(((pyj) this.a).a.I());
                    aw awVar = (aw) obj4;
                    uVar.j(awVar);
                    uVar.c();
                    awVar.aC(false);
                    return;
                }
                return;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                j$.util.Optional optionalOf = j$.util.Optional.of(pzp.p);
                java.lang.Object obj5 = this.a;
                qar qarVar = (qar) obj5;
                qarVar.j = optionalOf;
                u uVar2 = new u(qarVar.c.I());
                uVar2.q(2131429273, (aw) obj, (java.lang.String) null);
                uVar2.c();
                agsm.i(566, qarVar.q.i(qarVar.b.d, defpackage.jxn.f), "Emitting ENTRY_SCREEN_COMMITTED_INTO_LAYOUT failed.", new java.lang.Object[0]);
                qarVar.u.aF((android.view.View) this.b, new pmx(obj5, 10));
                return;
            default:
                qcg qcgVar = (qcg) this.b;
                if (qcgVar.h.b(zpo.g).contains((apqr) obj)) {
                    ((com.android.dialer.incall.onhold.ui.OnHoldView) this.a).setAccessibilityPaneTitle(qcgVar.b.z().getString(2132019082));
                    return;
                }
                return;
        }
    }

    @Override // java.util.function.Consumer
    public final /* synthetic */ java.util.function.Consumer andThen(java.util.function.Consumer consumer) {
        switch (this.$cid) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                break;
            case 11:
                break;
            case 12:
                break;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                break;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                break;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                break;
            case 16:
                break;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                break;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                break;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                break;
            default:
                break;
        }
        return j$.util.function.Consumer.-CC.$default$andThen(this, consumer);
    }

    public /* synthetic */ hvp(java.lang.Object obj, java.lang.Object obj2, int i, byte[] bArr) {
        this.$cid = i;
        this.b = obj;
        this.a = obj2;
    }
}
