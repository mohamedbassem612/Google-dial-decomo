package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class oqz implements defpackage.oqx {
    private final /* synthetic */ int $cid;
    final /* synthetic */ android.content.Context a;
    final /* synthetic */ java.lang.Object b;
    final /* synthetic */ java.lang.Object c;
    final /* synthetic */ java.lang.Object d;

    public oqz(defpackage.orc orcVar, android.content.Context context, java.lang.String str, defpackage.nwt nwtVar, int i) {
        this.$cid = i;
        this.a = context;
        this.c = str;
        this.b = nwtVar;
        j$.util.Objects.requireNonNull(orcVar);
        this.d = orcVar;
    }

    @Override // defpackage.oqx
    public final int a() {
        int i = this.$cid;
        if (i != 0) {
            return i != 1 ? 2131231918 : 2131231080;
        }
        return 2131231588;
    }

    @Override // defpackage.oqx
    public final java.lang.String b() {
        int i = this.$cid;
        if (i == 0) {
            return ((defpackage.orc) this.d).b.getString(2132018872);
        }
        if (i == 1) {
            return this.a.getString(2132020717);
        }
        if (i == 2) {
            java.lang.Object obj = ((rsr) this.b).a;
            return ((defpackage.orc) this.c).b.getString(2132017902);
        }
        if (i == 3) {
            java.lang.Object obj2 = ((rsr) this.b).a;
            return ((defpackage.orc) this.c).b.getString(2132017902);
        }
        java.lang.Object obj3 = this.b;
        if (i != 4) {
            java.lang.Object obj4 = ((rsr) obj3).a;
            return ((defpackage.orc) this.c).b.getString(2132017902);
        }
        java.lang.Object obj5 = ((rsr) obj3).a;
        return ((defpackage.orc) this.c).b.getString(2132017902);
    }

    @Override // defpackage.oqx
    public final void c(az azVar) {
        aify aifyVarQ;
        int i = this.$cid;
        if (i == 0) {
            defpackage.orc.a.b().l("com/android/dialer/historyitemactions/HistoryItemActionModulesBuilder$2", "onClick", 705, "HistoryItemActionModulesBuilder.java").v("do-not-screen option clicked");
            defpackage.orc orcVar = (defpackage.orc) this.d;
            orcVar.d.o(rmx.kF);
            java.lang.Object obj = this.b;
            j$.util.Optional optionalEmpty = j$.util.Optional.empty();
            kiu kiuVar = (kiu) obj;
            defpackage.kis kisVar = kiuVar.u;
            if (kisVar == null) {
                kisVar = defpackage.kis.a;
            }
            if (kisVar.d.size() > 0) {
                defpackage.kis kisVar2 = kiuVar.u;
                if (kisVar2 == null) {
                    kisVar2 = defpackage.kis.a;
                }
                optionalEmpty = j$.util.Optional.of(java.lang.Long.valueOf(kisVar2.d.a(0)));
            }
            j$.util.Optional optional = optionalEmpty;
            mnp mnpVar = (mnp) orcVar.e.g().orElseThrow(new defpackage.iaz(20));
            ahvr.cj(azVar, "FragmentActivity is required to show the dialog.");
            defpackage.hkd hkdVar = kiuVar.f;
            if (hkdVar == null) {
                hkdVar = defpackage.hkd.a;
            }
            java.lang.String str = hkdVar.c;
            defpackage.hkd hkdVar2 = kiuVar.f;
            if (hkdVar2 == null) {
                hkdVar2 = defpackage.hkd.a;
            }
            java.lang.Object obj2 = this.c;
            java.lang.String str2 = hkdVar2.d;
            akzx akzxVarM = rmy.a.m();
            akzxVarM.u();
            rmy rmyVar = akzxVarM.b;
            rmyVar.c = 1;
            rmyVar.b |= 1;
            mnpVar.f(str, str2, (java.lang.String) obj2, akzxVarM.p(), optional).r(azVar.a(), "dobby_do_not_screen_dialog");
            return;
        }
        if (i == 1) {
            java.lang.Object obj3 = this.d;
            android.content.Context context = this.a;
            orb orbVarAs = pez.as(context);
            defpackage.orc orcVar2 = (defpackage.orc) obj3;
            if (orcVar2.c()) {
                orbVarAs.nJ().i((java.lang.String) null).b(mce.ev);
            }
            orbVarAs.aS().k((java.lang.String) this.c, (defpackage.nwt) this.b);
            if (orcVar2.b()) {
                aifyVarQ = aify.p(orcVar2.c() ? rmw.lh : rmw.ev);
            } else {
                aifyVarQ = orcVar2.c() ? aify.q(rmw.lh, rmw.li) : aify.q(rmw.ev, rmw.fN);
            }
            rlv rlvVarBt = pez.as(context).bt();
            j$.util.Objects.requireNonNull(rlvVarBt);
            j$.lang.Iterable.-EL.forEach(aifyVarQ, new defpackage.fcg(rlvVarBt, 18));
            return;
        }
        if (i == 2) {
            ((defpackage.orc) this.c).d.o(rmx.eu);
            ahvr.cj(azVar, "FragmentActivity is required to show the dialog.");
            defpackage.al alVarAl = rsr.al(defpackage.hhv.j((kiu) this.d, 3, 2131428497));
            java.lang.Object obj4 = ((rsr) this.b).a;
            alVarAl.r(azVar.a(), "caller_id_feedback_dialog_fragment");
            return;
        }
        if (i == 3) {
            ((defpackage.orc) this.c).d.o(rmx.eZ);
            ahvr.cj(azVar, "FragmentActivity is required to show the dialog.");
            defpackage.al alVarAn = rsr.an(defpackage.hhv.j((kiu) this.d, 3, 2131428497));
            java.lang.Object obj5 = ((rsr) this.b).a;
            alVarAn.r(azVar.a(), "caller_tag_feedback_dialog_fragment");
            return;
        }
        java.lang.Object obj6 = this.c;
        if (i != 4) {
            ((defpackage.orc) obj6).d.o(rmx.fe);
            ahvr.cj(azVar, "FragmentActivity is required to show the dialog.");
            defpackage.al alVarAo = rsr.ao(defpackage.hhv.j((kiu) this.d, 3, 2131428497));
            java.lang.Object obj7 = ((rsr) this.b).a;
            alVarAo.r(azVar.a(), "caller_tag_selector_dialog_fragment");
            return;
        }
        ((defpackage.orc) obj6).d.o(rmx.fu);
        ahvr.cj(azVar, "FragmentActivity is required to show the dialog.");
        defpackage.al alVarAm = rsr.am(defpackage.hhv.j((kiu) this.d, 3, 2131428497));
        java.lang.Object obj8 = ((rsr) this.b).a;
        alVarAm.r(azVar.a(), "caller_id_suggestion_dialog_fragment");
    }

    @Override // defpackage.oqx
    public final void e() {
        int i = this.$cid;
        if (i == 0) {
            c((az) this.a);
            return;
        }
        if (i == 1) {
            c(null);
            return;
        }
        if (i == 2) {
            c((az) this.a);
            return;
        }
        if (i == 3) {
            c((az) this.a);
            return;
        }
        android.content.Context context = this.a;
        if (i != 4) {
            c((az) context);
        } else {
            c((az) context);
        }
    }

    public oqz(defpackage.orc orcVar, az azVar, kiu kiuVar, java.lang.String str, int i) {
        this.$cid = i;
        this.a = azVar;
        this.b = kiuVar;
        this.c = str;
        j$.util.Objects.requireNonNull(orcVar);
        this.d = orcVar;
    }

    public oqz(defpackage.orc orcVar, rsr rsrVar, az azVar, kiu kiuVar, int i) {
        this.$cid = i;
        this.b = rsrVar;
        this.a = azVar;
        this.d = kiuVar;
        j$.util.Objects.requireNonNull(orcVar);
        this.c = orcVar;
    }

    public oqz(defpackage.orc orcVar, rsr rsrVar, az azVar, kiu kiuVar, int i, byte[] bArr) {
        this.$cid = i;
        this.b = rsrVar;
        this.a = azVar;
        this.d = kiuVar;
        j$.util.Objects.requireNonNull(orcVar);
        this.c = orcVar;
    }

    public oqz(defpackage.orc orcVar, rsr rsrVar, az azVar, kiu kiuVar, int i, char[] cArr) {
        this.$cid = i;
        this.b = rsrVar;
        this.a = azVar;
        this.d = kiuVar;
        j$.util.Objects.requireNonNull(orcVar);
        this.c = orcVar;
    }

    @Override // defpackage.oqx
    public final /* synthetic */ void d() {
    }

    public oqz(defpackage.orc orcVar, rsr rsrVar, az azVar, kiu kiuVar, int i, short[] sArr) {
        this.$cid = i;
        this.b = rsrVar;
        this.a = azVar;
        this.d = kiuVar;
        j$.util.Objects.requireNonNull(orcVar);
        this.c = orcVar;
    }
}
