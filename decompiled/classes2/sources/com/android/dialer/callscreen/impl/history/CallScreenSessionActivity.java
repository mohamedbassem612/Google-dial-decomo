package com.android.dialer.callscreen.impl.history;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class CallScreenSessionActivity extends urd {
    public static final aimz n = aimz.i("com/android/dialer/callscreen/impl/history/CallScreenSessionActivity");
    public defpackage.lkq o;
    public defpackage.ldh p;
    public com.android.dialer.playback.CallRecordingPlayer q;
    public boolean r;
    private android.support.v7.widget.Toolbar s;
    private android.view.View t;
    private android.widget.TextView u;
    private android.widget.ImageView v;
    private android.widget.ImageView w;
    private defpackage.lpa x;
    private defpackage.lpa y;

    /* JADX WARN: Multi-variable type inference failed */
    private final void A(android.content.Intent intent) {
        abwd abwdVarB;
        ahvr.bM(intent.hasExtra("extra_transcript_id"));
        ahvr.bM(intent.hasExtra("extra_primary_text"));
        ahvr.bM(intent.hasExtra("extra_photo_info"));
        ahvr.bM(intent.hasExtra("extra_show_recording"));
        this.r = intent.getBooleanExtra("extra_show_recording", false);
        this.x.b(this, ((ldb) defpackage.hhe.K(this).fS().orElseThrow()).d.c(intent.getStringExtra("extra_transcript_id")), new defpackage.lot() { // from class: ldd
            @Override // defpackage.lot
            public final void a(java.lang.Object obj) {
                defpackage.lkq lkqVar;
                int i;
                com.android.dialer.callscreen.impl.history.CallScreenSessionActivity callScreenSessionActivity = this.a;
                defpackage.lkq lkqVar2 = (defpackage.lkq) obj;
                callScreenSessionActivity.o = lkqVar2;
                if (lkqVar2 != null) {
                    com.android.dialer.callscreen.impl.history.CallScreenSessionActivity.n.b().l("com/android/dialer/callscreen/impl/history/CallScreenSessionActivity", "updateTranscriptState", 260, "CallScreenSessionActivity.java").y("currently rated: %b", java.lang.Boolean.valueOf(callScreenSessionActivity.o.d));
                    int i2 = 0;
                    callScreenSessionActivity.z(true != callScreenSessionActivity.o.d ? 0 : 8);
                    defpackage.ldh ldhVar = callScreenSessionActivity.p;
                    defpackage.lkq lkqVar3 = callScreenSessionActivity.o;
                    if (lkqVar3 == null) {
                        a.bI(defpackage.ldh.a.d(), "null CallScreenTranscript", "com/android/dialer/callscreen/impl/history/CallScreenSessionAdapter", "setCallScreenTranscript", 'd', "CallScreenSessionAdapter.java", zct.b);
                    } else {
                        defpackage.lgp lgpVar = lkqVar3.b;
                        if (lgpVar == null) {
                            a.bI(defpackage.ldh.a.d(), "null transcript conversation", "com/android/dialer/callscreen/impl/history/CallScreenSessionAdapter", "setCallScreenTranscript", 'i', "CallScreenSessionAdapter.java", zct.b);
                        } else {
                            if (lgpVar.b.isEmpty()) {
                                defpackage.ldh.a.b().l("com/android/dialer/callscreen/impl/history/CallScreenSessionAdapter", "lastEntryIsTerminationMessage", 153, "CallScreenSessionAdapter.java").v("there are no transcript conversations");
                            } else {
                                defpackage.lgp lgpVar2 = lkqVar3.b;
                                int iAN = a.aN(((defpackage.lgo) lgpVar2.b.get(lgpVar2.b.size() - 1)).g);
                                if (iAN == 0 || iAN != 4) {
                                    defpackage.ldh.a.b().l("com/android/dialer/callscreen/impl/history/CallScreenSessionAdapter", "lastEntryIsTerminationMessage", 166, "CallScreenSessionAdapter.java").v("last message was not a termination message");
                                } else {
                                    defpackage.ldh.a.b().l("com/android/dialer/callscreen/impl/history/CallScreenSessionAdapter", "lastEntryIsTerminationMessage", 162, "CallScreenSessionAdapter.java").v("last message is a termination message");
                                    defpackage.lgp lgpVar3 = lkqVar3.b;
                                    ldhVar.g = (defpackage.lgo) lgpVar3.b.get(lgpVar3.b.size() - 1);
                                    defpackage.lkq lkqVar4 = new defpackage.lkq();
                                    lkqVar4.a(lkqVar3.a);
                                    lkqVar4.d = lkqVar3.d;
                                    akzx akzxVarM = defpackage.lgp.a.m();
                                    for (int i3 = 0; i3 < lkqVar3.b.b.size() - 1; i3++) {
                                        akzxVarM.I((defpackage.lgo) lkqVar3.b.b.get(i3));
                                    }
                                    lkqVar4.b = (defpackage.lgp) akzxVarM.p();
                                    ldhVar.f = lkqVar4;
                                }
                                lkqVar = ldhVar.f;
                                while (true) {
                                    i = i2 + 1;
                                    if (i >= lkqVar.b.b.size() || defpackage.ldh.w((defpackage.lgo) lkqVar.b.b.get(i2)) != defpackage.ldh.w((defpackage.lgo) lkqVar.b.b.get(i))) {
                                        break;
                                    } else {
                                        i2 = i;
                                    }
                                }
                                ldhVar.h = i2;
                                ldhVar.e();
                            }
                            ldhVar.f = lkqVar3;
                            lkqVar = ldhVar.f;
                            while (true) {
                                i = i2 + 1;
                                if (i >= lkqVar.b.b.size()) {
                                    break;
                                }
                                break;
                                break;
                                i2 = i;
                            }
                            ldhVar.h = i2;
                            ldhVar.e();
                        }
                    }
                    callScreenSessionActivity.q.b();
                    if (callScreenSessionActivity.r) {
                        callScreenSessionActivity.q.e(lkqVar2.c);
                    }
                    callScreenSessionActivity.q.i(new defpackage.jnv(callScreenSessionActivity, lkqVar2, 12, null));
                }
            }
        }, new defpackage.jox(7));
        this.s.x(intent.getStringExtra("extra_primary_text"));
        try {
            abwdVarB = alad.B(abwd.a, intent.getByteArrayExtra("extra_photo_info"), akzq.a());
        } catch (alaz e) {
            a.bq(n.c(), "unable to parse and convert byte array to PhotoInfo", "com/android/dialer/callscreen/impl/history/CallScreenSessionActivity", "handleIntent", (char) 246, "CallScreenSessionActivity.java", e, zct.b);
            abwdVarB = null;
        }
        akzx akzxVarM = abwd.a.m();
        akzxVarM.z(abwdVarB);
        akzxVarM.u();
        abwd abwdVar = akzxVarM.b;
        abwdVar.b |= 1024;
        abwdVar.m = false;
        akzxVarM.u();
        abwd abwdVar2 = akzxVarM.b;
        abwdVar2.b |= 512;
        abwdVar2.l = false;
        this.p.e = akzxVarM.p();
    }

    public static android.content.Intent w(android.content.Context context, java.lang.String str, java.lang.String str2, abwd abwdVar, boolean z) {
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.android.dialer.callscreen.impl.history.CallScreenSessionActivity.class);
        intent.putExtra("extra_transcript_id", str);
        intent.putExtra("extra_primary_text", str2);
        intent.putExtra("extra_photo_info", abwdVar.i());
        intent.putExtra("extra_show_recording", z);
        return intent;
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected final void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        n.b().l("com/android/dialer/callscreen/impl/history/CallScreenSessionActivity", "onCreate", 81, "CallScreenSessionActivity.java").v("onCreate");
        ldg ldgVarK = defpackage.hhe.K(this);
        setContentView(2131623973);
        this.s = findViewById(2131429294);
        this.t = findViewById(2131427701);
        this.u = (android.widget.TextView) findViewById(2131427703);
        this.v = (android.widget.ImageView) findViewById(2131427705);
        this.w = (android.widget.ImageView) findViewById(2131427704);
        this.v.setOnClickListener(new defpackage.lde(this, 0));
        this.w.setOnClickListener(new defpackage.lde(this, 2));
        this.q = findViewById(2131427683);
        android.support.v7.widget.RecyclerView recyclerViewFindViewById = findViewById(2131427689);
        recyclerViewFindViewById.aa(new android.support.v7.widget.LinearLayoutManager(1, false));
        recyclerViewFindViewById.r = true;
        defpackage.ldh ldhVar = new defpackage.ldh(this);
        this.p = ldhVar;
        recyclerViewFindViewById.Y(ldhVar);
        com.google.android.material.appbar.AppBarLayout appBarLayoutFindViewById = findViewById(2131427477);
        appBarLayoutFindViewById.o(true);
        recyclerViewFindViewById.setOnScrollChangeListener(new defpackage.lyf(appBarLayoutFindViewById, recyclerViewFindViewById, 1));
        this.x = defpackage.lpa.a(a(), "Load Call Screen locallyStoredTranscript");
        this.y = defpackage.lpa.a(a(), "Update Call Screen locallyStoredTranscript");
        ldgVarK.bt().o(rmx.ca);
        this.q.f = j$.util.Optional.of(new rai(this));
        this.q.g = j$.util.Optional.of(new rai(this));
        android.view.View viewFindViewById = findViewById(2131427683);
        defpackage.izf izfVar = new defpackage.izf(4);
        int i = dzs.a;
        dzk.o(viewFindViewById, izfVar);
        A(getIntent());
    }

    protected final void onNewIntent(android.content.Intent intent) {
        super.onNewIntent(intent);
        A(intent);
    }

    public final boolean onOptionsItemSelected(android.view.MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        finish();
        return true;
    }

    protected final void onPause() {
        super.onPause();
        this.q.b();
    }

    protected final void onResume() {
        super.onResume();
        this.q.b();
        com.android.dialer.playback.CallRecordingPlayer callRecordingPlayer = this.q;
        defpackage.lkq lkqVar = this.o;
        java.lang.String str = null;
        if (lkqVar != null && this.r) {
            str = lkqVar.c;
        }
        callRecordingPlayer.e(str);
        this.q.i(new defpackage.ldf(this, 0));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void x(java.lang.String str) {
        n.b().l("com/android/dialer/callscreen/impl/history/CallScreenSessionActivity", "delete", 288, "CallScreenSessionActivity.java").y("Deleting transcript and audio: %s", str);
        ((ldb) defpackage.hhe.K(this).fS().orElseThrow()).a(aify.p(str)).c(new defpackage.fvl(2), ajbm.a);
        finish();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void y() {
        ahvr.bZ(this.o != null, "locallyStoredTranscript cannot be null for rating");
        this.o.d = true;
        this.y.b(this, ((ldb) defpackage.hhe.K(this).fS().orElseThrow()).d.e(this.o.a, new defpackage.lct(2), j$.time.Instant.now().toEpochMilli()), new defpackage.joy(3), new defpackage.jox(8));
    }

    public final void z(int i) {
        this.t.setVisibility(i);
        this.u.setVisibility(i);
        this.v.setVisibility(i);
        this.w.setVisibility(i);
    }
}
