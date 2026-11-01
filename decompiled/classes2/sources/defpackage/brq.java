package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class brq extends defpackage.mr {
    public final defpackage.bro a;
    private aomy b;
    private defpackage.brt c;
    private long d;
    private final android.view.View e;
    private final float f;

    /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v3, types: [android.view.View, bro] */
    public brq(aomy aomyVar, defpackage.brt brtVar, long j, android.view.View view, dpq dpqVar, dpf dpfVar, java.util.UUID uuid) throws aois {
        super(new android.view.ContextThemeWrapper(view.getContext(), 2132083306), 0);
        this.b = aomyVar;
        this.c = brtVar;
        this.d = j;
        this.e = view;
        this.f = 8.0f;
        android.view.Window window = getWindow();
        if (window == null) {
            throw new java.lang.IllegalStateException("Dialog has no window");
        }
        window.requestFeature(1);
        window.setBackgroundDrawableResource(android.R.color.transparent);
        dzn.c(window, false);
        ?? broVar = new defpackage.bro(getContext(), window);
        java.util.Objects.toString(uuid);
        broVar.setTag(2131427791, "Dialog:".concat(java.lang.String.valueOf(uuid)));
        broVar.setClipChildren(false);
        broVar.setElevation(dpfVar.dl(8.0f));
        broVar.setOutlineProvider(new defpackage.brp());
        this.a = broVar;
        setContentView((android.view.View) broVar);
        dzo.l((android.view.View) broVar, dzo.k(view));
        dzo.j((android.view.View) broVar, dzo.i(view));
        dzk.O((android.view.View) broVar, dzk.N(view));
        a(this.b, this.c, this.d, dpqVar);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
    public final void a(aomy aomyVar, defpackage.brt brtVar, long j, dpq dpqVar) throws aois {
        this.b = aomyVar;
        this.c = brtVar;
        this.d = j;
        int i = brtVar.a;
        boolean zBh = mni.bh(this.e);
        android.view.Window window = getWindow();
        aooh.c(window);
        int i2 = 1;
        window.setFlags(true != zBh ? -8193 : 8192, 8192);
        int iOrdinal = dpqVar.ordinal();
        if (iOrdinal == 0) {
            i2 = 0;
        } else if (iOrdinal != 1) {
            throw new aois();
        }
        this.a.setLayoutDirection(i2);
        android.view.Window window2 = getWindow();
        if (window2 != null) {
            window2.setLayout(-1, -1);
        }
        android.view.Window window3 = getWindow();
        if (window3 != null) {
            window3.setSoftInputMode(48);
        }
        android.view.Window window4 = getWindow();
        aooh.c(window4);
        android.view.Window window5 = getWindow();
        aooh.c(window5);
        window5.getDecorView();
        defpackage.ni niVar = new defpackage.ni(window4);
        niVar.g(defpackage.rl.g(j));
        niVar.f(defpackage.rl.g(j));
    }

    @Override // android.app.Dialog
    public final boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
        if (zOnTouchEvent) {
            this.b.a();
        }
        return zOnTouchEvent;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void cancel() {
    }
}
