package com.android.dialer.rtt.transcript;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class RttTranscriptActivity extends urd {
    private defpackage.tdv n;
    private lpa o;
    private com.android.dialer.widget.DialerToolbar p;
    private urg q;
    private ahpz r;
    private tvn s;

    /* JADX WARN: Multi-variable type inference failed */
    private final void w(android.content.Intent intent) {
        ahvr.bM(intent.hasExtra("extra_transcript_id"));
        ahvr.bM(intent.hasExtra("extra_primary_text"));
        ahvr.bM(intent.hasExtra("extra_photo_info"));
        java.lang.String stringExtra = intent.getStringExtra("extra_transcript_id");
        lpa lpaVar = this.o;
        ajcq ajcqVarF = ahvr.F(new defpackage.syg(this, stringExtra, 4), defpackage.sns.k(this).cd().b);
        defpackage.tdv tdvVar = this.n;
        j$.util.Objects.requireNonNull(tdvVar);
        lpaVar.b(this, ajcqVarF, new kll(tdvVar, 13), new jox(18));
        this.p.x(intent.getStringExtra("extra_primary_text"));
        defpackage.abwd abwdVar = defpackage.abwd.a;
        defpackage.abwd abwdVarT = defpackage.sns.t(intent, "extra_photo_info", abwdVar);
        akzx akzxVarM = abwdVar.m();
        akzxVarM.z(abwdVarT);
        akzxVarM.u();
        defpackage.abwd abwdVar2 = (defpackage.abwd) akzxVarM.b;
        abwdVar2.b |= 1024;
        abwdVar2.m = false;
        akzxVarM.u();
        defpackage.abwd abwdVar3 = (defpackage.abwd) akzxVarM.b;
        abwdVar3.b |= 512;
        abwdVar3.l = false;
        this.n.e = (defpackage.abwd) akzxVarM.p();
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected final void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setContentView(2131623976);
        this.p = (com.android.dialer.widget.DialerToolbar) findViewById(2131429294);
        this.q = defpackage.sns.k(this).cI();
        tvn tvnVarOE = defpackage.sns.k(this).oE();
        this.s = tvnVarOE;
        tvnVarOE.r(this, 2132084702);
        android.support.v7.widget.RecyclerView recyclerViewFindViewById = findViewById(2131428847);
        recyclerViewFindViewById.aa(new android.support.v7.widget.LinearLayoutManager(1, false));
        recyclerViewFindViewById.r = true;
        defpackage.tdv tdvVar = new defpackage.tdv(this);
        this.n = tdvVar;
        recyclerViewFindViewById.Y(tdvVar);
        this.o = lpa.a(a(), "Load RTT transcript");
        w(getIntent());
        this.r = defpackage.sns.k(this).fi();
        android.view.View viewFindViewById = findViewById(2131428852);
        ahpr ahprVar = new ahpr(this.r, 881, "rtt_transcript_apply_window_insets_compat", new izf(10));
        int i = dzs.a;
        dzk.o(viewFindViewById, ahprVar);
    }

    protected final void onNewIntent(android.content.Intent intent) {
        super.onNewIntent(intent);
        w(intent);
    }

    public final boolean onOptionsItemSelected(android.view.MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        fc().e();
        return true;
    }

    protected final void onStart() {
        super.onStart();
        if (android.os.Build.VERSION.SDK_INT < 35) {
            ft$.ExternalSyntheticApiModelOutline0.m(getWindow(), 0);
            if (this.q.g() == 2) {
                getWindow().setNavigationBarColor(0);
            }
        }
    }
}
