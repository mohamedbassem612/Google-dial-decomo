package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class loi {
    public static final aimz a = aimz.i("com/android/dialer/chocolatechip/impl/ui/ChocolateChipFragmentPeer");
    private boolean A;
    private final aogc B;
    public final android.content.Context b;
    public final az c;
    public final defpackage.loc d;
    public final aoss e;
    public final aoss f;
    public final rlv g;
    public final zrw h;
    public final ruc i;
    public final defpackage.lon j;
    public final ahpz k;
    public final rkg l;
    public final defpackage.lny m;
    public final agtj n;
    public android.support.v7.widget.LinearLayoutManager o;
    public defpackage.lom p;
    public android.net.Uri q;
    public boolean r;
    public boolean s;
    public aomy t;
    public final android.content.BroadcastReceiver u;
    public final agtk v;
    public android.view.View.OnScrollChangeListener w;
    public final gpd x;
    public final ahbv y;
    public final rai z;

    public loi(android.content.Context context, az azVar, defpackage.loc locVar, aoss aossVar, aoss aossVar2, rlv rlvVar, zrw zrwVar, ruc rucVar, aogc aogcVar, defpackage.lon lonVar, rai raiVar, gpd gpdVar, ahpz ahpzVar, rkg rkgVar, defpackage.lny lnyVar, agtj agtjVar, ahbv ahbvVar) {
        aooh.f(azVar, "activity");
        aooh.f(aossVar, "lightweightScope");
        aooh.f(rlvVar, "loggingBindings");
        aooh.f(rucVar, "metrics");
        aooh.f(raiVar, "contactsPagingAdapterFactory");
        aooh.f(gpdVar, "cuiSemanticLoggerFactory");
        aooh.f(ahpzVar, "traceCreation");
        aooh.f(agtjVar, "futuresMixin");
        this.b = context;
        this.c = azVar;
        this.d = locVar;
        this.e = aossVar;
        this.f = aossVar2;
        this.g = rlvVar;
        this.h = zrwVar;
        this.i = rucVar;
        this.B = aogcVar;
        this.j = lonVar;
        this.z = raiVar;
        this.x = gpdVar;
        this.k = ahpzVar;
        this.l = rkgVar;
        this.m = lnyVar;
        this.n = agtjVar;
        this.y = ahbvVar;
        this.t = new jaf(9);
        this.u = new defpackage.log(this);
        this.v = new defpackage.lof(this);
    }

    public static final void e(defpackage.loi loiVar, android.view.View view) {
        loiVar.g.o(rmx.lt);
        try {
            android.content.Context contextA = loiVar.d.A();
            android.content.Intent type = new android.content.Intent("android.intent.action.INSERT").setType("vnd.android.cursor.dir/contact");
            aooh.e(type, "setType(...)");
            ahqx.l(contextA, type);
        } catch (android.content.ActivityNotFoundException e) {
            a.d().k(e).m(aioa.c).l("com/android/dialer/chocolatechip/impl/ui/ChocolateChipFragmentPeer", "setEmptyContentView$<anonymous>$<anonymous>", 511, "ChocolateChipFragmentPeer.kt").v("failed to start activity");
            agby.o(view, 2132017291, -1).h();
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object a(aoln aolnVar) {
        defpackage.loh lohVar;
        if (aolnVar instanceof defpackage.loh) {
            lohVar = (defpackage.loh) aolnVar;
            int i = lohVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                lohVar.c = i - Integer.MIN_VALUE;
            } else {
                lohVar = new defpackage.loh(this, aolnVar);
            }
        } else {
            lohVar = new defpackage.loh(this, aolnVar);
        }
        java.lang.Object objE = lohVar.a;
        aolu aoluVar = aolu.a;
        int i2 = lohVar.c;
        if (i2 == 0) {
            aooc.af(objE);
            zrw zrwVar = this.h;
            java.util.List list = zrw.b;
            lohVar.c = 1;
            objE = zrwVar.e(list, lohVar);
            if (objE == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(objE);
        }
        java.lang.String[] strArr = (java.lang.String[]) objE;
        if (strArr.length != 0) {
            a.b().l("com/android/dialer/chocolatechip/impl/ui/ChocolateChipFragmentPeer", "requestContactsGroupPermissions", 638, "ChocolateChipFragmentPeer.kt").y("Requesting permissions: %s", strArr.toString());
            this.d.ar(strArr, 1);
        }
        return aojh.a;
    }

    public final void b(android.view.View view) {
        if (this.A) {
            this.g.o(rmx.sD);
            this.B.aF(view, new defpackage.ldf(this, 16));
        } else {
            this.A = true;
            this.B.aF(view, new defpackage.ldf(this, 17));
        }
    }

    public final void c() {
        aimz aimzVar = zih.a;
        aoov.al(this.f, zih.b.plus(aols.a), 1, new defpackage.loe((aoln) null, this, 1));
    }

    public final void d(boolean z) {
        android.view.View view;
        android.support.v7.widget.RecyclerView recyclerViewFindViewById;
        a.b().l("com/android/dialer/chocolatechip/impl/ui/ChocolateChipFragmentPeer", "onHiddenChanged", 544, "ChocolateChipFragmentPeer.kt").y("onHiddenChanged, hidden = %b", java.lang.Boolean.valueOf(z));
        if (z) {
            this.l.d(this.d.H());
        } else if (this.r) {
            defpackage.lom lomVar = this.p;
            if (lomVar != null) {
                android.net.Uri uri = this.q;
                if (true != this.s) {
                    uri = null;
                }
                lomVar.y(uri);
            }
            rkg rkgVar = this.l;
            android.content.Context context = this.b;
            android.net.Uri uri2 = this.q;
            if (uri2 == null) {
                throw new java.lang.IllegalArgumentException("Required value was null.");
            }
            rkgVar.b(context, uri2);
        }
        if (!z && !rhx.c(this.d.A())) {
            this.r = false;
        }
        if (z || !this.A || (view = ((aw) this.d).Q) == null || (recyclerViewFindViewById = view.findViewById(2131428773)) == null) {
            return;
        }
        this.B.aF(recyclerViewFindViewById, new defpackage.ldf(this, 15));
    }

    public final boolean f() {
        return rhx.b(this.d.A());
    }
}
