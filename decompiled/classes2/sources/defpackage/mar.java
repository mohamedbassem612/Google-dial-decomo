package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class mar implements android.view.View.OnClickListener {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;
    public final /* synthetic */ java.lang.Object c;
    public final /* synthetic */ java.lang.Object d;

    public /* synthetic */ mar(aekj aekjVar, aelt aeltVar, aekm aekmVar, aelu aeluVar, int i) {
        this.$cid = i;
        this.c = aekjVar;
        this.a = aeltVar;
        this.b = aekmVar;
        this.d = aeluVar;
    }

    /* JADX WARN: Type inference failed for: r14v37, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v16, types: [aelt, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v20, types: [aelt, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v21, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, java.util.Map] */
    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        int i = this.$cid;
        if (i == 0) {
            kiu kiuVar = (kiu) this.b;
            int i2 = kiuVar.q;
            java.lang.Object obj = this.a;
            if (i2 != 3 && kiuVar.x != 0) {
                epq.a(((mau) obj).b).d(new android.content.Intent("action_history_button_clicked"));
            }
            java.lang.Object obj2 = this.d;
            java.lang.Object obj3 = this.c;
            mau mauVar = (mau) obj;
            mauVar.o.bm(rmu.k);
            mauVar.c.o(rmx.lN);
            mauVar.j.i((java.lang.String) null).b(mce.de);
            ahqx.l((android.content.Context) obj3, (android.content.Intent) obj2);
            return;
        }
        if (i != 1) {
            if (i == 2) {
                com.android.dialer.timekeeper.histogram.HistogramView histogramView = (com.android.dialer.timekeeper.histogram.HistogramView) this.d;
                if (!view.equals(histogramView.s)) {
                    histogramView.l((android.support.v7.widget.AppCompatImageView) view, (java.util.Map) this.a, (vqu) this.b);
                }
                ((abtr) this.c).t(3);
                return;
            }
            if (i == 3) {
                this.a.e(new adae(5), view);
                ((aekm) this.b).a.h = (aelu) this.d;
                ((aekj) this.c).g(view);
                return;
            }
            if (i == 4) {
                this.a.e(new adae(5), view);
                ((aekj) this.d).e((aekp) this.b, ((aekm) this.c).a.a());
                return;
            }
            ?? r14 = ((zoe) this.d).a;
            java.lang.Object obj4 = ((ahys) this.a).a;
            if (!r14.containsKey(obj4) || hq$.ExternalSyntheticApiModelOutline1.m((android.os.UserManager) ((android.content.Context) ((ucm) ((apjb) r14.get(obj4)).a).a).getSystemService(android.os.UserManager.class))) {
                return;
            }
            ahvr.cc(r14.containsKey(obj4), "No AddAccountHandler found for account type %s", obj4);
            apjb apjbVar = (apjb) r14.get(obj4);
            java.lang.Object obj5 = apjbVar.a;
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putBoolean("allowSkip", false);
            java.lang.Object obj6 = ((ucm) obj5).b;
            android.os.StrictMode.ThreadPolicy threadPolicy = android.os.StrictMode.getThreadPolicy();
            android.os.StrictMode.setThreadPolicy(new android.os.StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().permitDiskWrites().build());
            java.lang.Object obj7 = apjbVar.b;
            try {
                java.lang.Object obj8 = ((zoe) obj6).a;
                ajcq ajcqVarF = ajan.f(aiql.E(ahqx.b(new adck(obj8, new agpj(bundle, (android.app.Activity) obj7), 8, (byte[]) null)), (java.util.concurrent.Executor) ((ucm) obj8).a), ahqx.a(new agnw(2)), ajbm.a);
                java.lang.Object obj9 = this.b;
                java.lang.Object obj10 = this.c;
                android.os.StrictMode.setThreadPolicy(threadPolicy);
                ((agtj) obj9).i(new zoe(ajan.g(ajcqVarF, ahqx.c(new agpe(obj5, 2)), ajbm.a)), ((agro) obj10).c);
                return;
            } catch (java.lang.Throwable th) {
                android.os.StrictMode.setThreadPolicy(threadPolicy);
                throw th;
            }
        }
        com.google.android.material.chip.Chip chip = (com.google.android.material.chip.Chip) this.b;
        boolean zIsChecked = chip.isChecked();
        java.lang.Object obj11 = this.a;
        if (zIsChecked) {
            if (chip.getId() == 2131428589) {
                ((com.google.android.material.chip.ChipGroup) obj11).a.c();
                chip.setChecked(true);
            } else {
                if (chip.getId() == 2131428978) {
                    java.lang.Object obj12 = this.c;
                    akzx akzxVarM = defpackage.jmb.a.m();
                    aooh.f(akzxVarM, "builder");
                    akzxVarM.u();
                    defpackage.jmb jmbVar = (defpackage.jmb) akzxVarM.b;
                    jmbVar.b |= 1;
                    defpackage.jlv jlvVar = (defpackage.jlv) obj12;
                    jmbVar.c = jlvVar.b;
                    java.lang.CharSequence text = chip.getText();
                    afqz afqzVar = jlvVar.a;
                    android.content.Context contextZ = afqzVar.z();
                    if (!aooh.n(text, contextZ != null ? contextZ.getString(2132020183) : null)) {
                        java.lang.String string = chip.getText().toString();
                        aooh.f(string, "value");
                        akzxVarM.u();
                        defpackage.jmb jmbVar2 = (defpackage.jmb) akzxVarM.b;
                        j$.util.Objects.requireNonNull(string);
                        jmbVar2.b |= 2;
                        jmbVar2.d = string;
                    }
                    int i3 = jlvVar.e;
                    akzxVarM.u();
                    defpackage.jmb jmbVar3 = (defpackage.jmb) akzxVarM.b;
                    jmbVar3.b |= 8;
                    jmbVar3.f = i3;
                    defpackage.jmu jmuVar = jlvVar.d;
                    akzxVarM.u();
                    defpackage.jmb jmbVar4 = (defpackage.jmb) akzxVarM.b;
                    jmbVar4.e = jmuVar.a();
                    jmbVar4.b |= 4;
                    alad aladVarP = akzxVarM.p();
                    aooh.e(aladVarP, "build(...)");
                    defpackage.jlx jlxVar = new defpackage.jlx();
                    amxr.g(jlxVar);
                    ahgl.b(jlxVar, (defpackage.jmb) aladVarP);
                    jlxVar.r(afqzVar.I(), "scam_suggestion_dialog");
                }
                ((com.google.android.material.chip.ChipGroup) obj11).requireViewById(2131428589).setChecked(false);
            }
        }
        ((android.widget.Button) ft$.ExternalSyntheticApiModelOutline0.m((android.view.View) this.d, 2131428709)).setEnabled(!((com.google.android.material.chip.ChipGroup) obj11).a().isEmpty());
    }

    public /* synthetic */ mar(agro agroVar, ahyn ahynVar, zoe zoeVar, agtj agtjVar, int i) {
        this.$cid = i;
        this.c = agroVar;
        this.a = ahynVar;
        this.d = zoeVar;
        this.b = agtjVar;
    }

    public /* synthetic */ mar(android.view.ViewGroup viewGroup, java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, int i) {
        this.$cid = i;
        this.d = viewGroup;
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    public /* synthetic */ mar(com.google.android.material.chip.Chip chip, com.google.android.material.chip.ChipGroup chipGroup, defpackage.jlv jlvVar, android.view.View view, int i) {
        this.$cid = i;
        this.b = chip;
        this.a = chipGroup;
        this.c = jlvVar;
        this.d = view;
    }

    public /* synthetic */ mar(mau mauVar, kiu kiuVar, az azVar, android.content.Intent intent, int i) {
        this.$cid = i;
        this.a = mauVar;
        this.b = kiuVar;
        this.c = azVar;
        this.d = intent;
    }
}
