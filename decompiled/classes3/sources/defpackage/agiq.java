package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class agiq extends defpackage.afqy {
    public static final xtq i = new xtq("SetupProgressBottomSheet", (byte[]) null);
    public final defpackage.aghg g;
    public agip h;

    public agiq(android.content.Context context, defpackage.aghg aghgVar) {
        super(context, 2132084116);
        this.g = aghgVar;
    }

    public static final void b(android.widget.ImageView imageView, android.graphics.Bitmap bitmap, int i2, boolean z) {
        if (bitmap != null) {
            imageView.setImageBitmap(bitmap);
        }
        if (i2 == 0) {
            imageView.clearColorFilter();
        } else {
            imageView.setColorFilter(i2, android.graphics.PorterDuff.Mode.SRC_IN);
        }
        int i3 = 8;
        if (bitmap != null && z) {
            i3 = 0;
        }
        imageView.setVisibility(i3);
    }

    public static final void d(android.widget.TextView textView, java.lang.String str) {
        if (str != null && str.length() != 0) {
            textView.setText(str);
        }
        int i2 = 8;
        if (str != null && str.length() != 0) {
            i2 = 0;
        }
        textView.setVisibility(i2);
    }

    @Override // defpackage.afqy
    protected final void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.g.c = true;
        setContentView(2131624622);
        android.view.View viewFindViewById = findViewById(2131429128);
        if (viewFindViewById == null) {
            throw new java.lang.IllegalStateException("Required value was null.");
        }
        agip agipVar = new agip(viewFindViewById);
        agipVar.n.setOnClickListener(new defpackage.afrh((java.lang.Object) this, 11));
        this.h = agipVar;
    }

    @Override // defpackage.afqy
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.h = null;
    }

    @Override // defpackage.afqy
    protected final void onStart() {
        super.onStart();
        agip agipVar = this.h;
        emx emxVarK = agipVar != null ? dzo.k(agipVar.a) : null;
        if (emxVarK == null) {
            i.z("ViewLifecycleOwner is null. Not observing ViewModel.");
        } else {
            aoov.an(dzn.h(emxVarK), (aolr) null, 0, new defpackage.afmq(emxVarK, this, (aoln) null, 3), 3);
        }
        if (getContext().getResources().getConfiguration().orientation == 2) {
            a().t(3);
            a().w = true;
        }
    }
}
