package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ykn extends css implements cdv {
    public final android.graphics.drawable.Drawable a;
    public final ccp b;
    public final ccp c;
    private final aoir d;

    public ykn(android.graphics.drawable.Drawable drawable) {
        aooh.f(drawable, "drawable");
        this.a = drawable;
        cdu cduVar = cdu.c;
        this.b = new androidx.compose.runtime.ParcelableSnapshotMutableState(0, cduVar);
        this.c = new androidx.compose.runtime.ParcelableSnapshotMutableState(new cpp(defpackage.yko.a(drawable)), cduVar);
        this.d = aooc.ag(new defpackage.xmr(this, 5));
        if (drawable.getIntrinsicWidth() < 0 || drawable.getIntrinsicHeight() < 0) {
            return;
        }
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
    }

    private final long k() {
        return ((cpp) this.c.a()).a;
    }

    public final long a() {
        return k();
    }

    protected final void b(csj csjVar) {
        cqf cqfVarB = csjVar.q().b();
        g();
        try {
            cqfVarB.g();
            if (android.os.Build.VERSION.SDK_INT >= 31 || !ft$.ExternalSyntheticApiModelOutline0.m(this.a)) {
                this.a.setBounds(0, 0, aopc.i(java.lang.Float.intBitsToFloat((int) (csjVar.o() >> 32))), aopc.i(java.lang.Float.intBitsToFloat((int) (csjVar.o() & 4294967295L))));
            } else {
                cqfVarB.h(java.lang.Float.intBitsToFloat((int) (csjVar.o() >> 32)) / java.lang.Float.intBitsToFloat((int) (k() >> 32)), java.lang.Float.intBitsToFloat((int) (csjVar.o() & 4294967295L)) / java.lang.Float.intBitsToFloat((int) (k() & 4294967295L)));
            }
            this.a.draw(cpr.a(cqfVarB));
        } finally {
            cqfVarB.e();
        }
    }

    protected final void c(float f) {
        this.a.setAlpha(aooc.w(aopc.i(f * 255.0f), 0, 255));
    }

    protected final void d(cqh cqhVar) {
        this.a.setColorFilter(cqhVar != null ? cqhVar.b : null);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
    protected final void f(dpq dpqVar) throws aois {
        int i;
        aooh.f(dpqVar, "layoutDirection");
        int iOrdinal = dpqVar.ordinal();
        if (iOrdinal != 0) {
            i = 1;
            if (iOrdinal != 1) {
                throw new aois();
            }
        } else {
            i = 0;
        }
        this.a.setLayoutDirection(i);
    }

    public final int g() {
        return ((java.lang.Number) this.b.a()).intValue();
    }

    public final void h() {
        i();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void i() {
        android.graphics.drawable.Drawable drawable = this.a;
        if (drawable instanceof android.graphics.drawable.Animatable) {
            ((android.graphics.drawable.Animatable) drawable).stop();
        }
        drawable.setVisible(false, false);
        drawable.setCallback(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void j() {
        android.graphics.drawable.Drawable.Callback callback = (android.graphics.drawable.Drawable.Callback) this.d.a();
        android.graphics.drawable.Drawable drawable = this.a;
        drawable.setCallback(callback);
        drawable.setVisible(true, true);
        if (drawable instanceof android.graphics.drawable.Animatable) {
            ((android.graphics.drawable.Animatable) drawable).start();
        }
    }
}
