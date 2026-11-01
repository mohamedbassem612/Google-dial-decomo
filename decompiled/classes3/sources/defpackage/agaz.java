package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class agaz extends agax {
    private boolean f = false;
    public float e = 0.0f;

    public agaz(android.view.View view) {
        d(view);
    }

    private void d(android.view.View view) {
        view.setOutlineProvider(new defpackage.agay(this));
    }

    public final void a(android.view.View view) {
        boolean z;
        agal agalVar;
        agal agalVar2;
        android.graphics.RectF rectF;
        agal agalVar3 = this.b;
        this.e = (agalVar3 == null || (rectF = this.c) == null) ? 0.0f : agalVar3.c.a(rectF);
        if (this.c.isEmpty() || (agalVar2 = this.b) == null || !agalVar2.h(this.c)) {
            z = false;
            if (!this.c.isEmpty() && (agalVar = this.b) != null && this.a && !agalVar.h(this.c)) {
                agal agalVar4 = this.b;
                if ((agalVar4.j instanceof agaj) && (agalVar4.k instanceof agaj) && (agalVar4.m instanceof agaj) && (agalVar4.l instanceof agaj)) {
                    float fA = agalVar4.b.a(this.c);
                    float fA2 = this.b.c.a(this.c);
                    float fA3 = this.b.e.a(this.c);
                    float fA4 = this.b.d.a(this.c);
                    if (fA == 0.0f && fA3 == 0.0f && fA2 == fA4) {
                        android.graphics.RectF rectF2 = this.c;
                        rectF2.set(rectF2.left - fA2, this.c.top, this.c.right, this.c.bottom);
                        this.e = fA2;
                    } else if (fA == 0.0f && fA2 == 0.0f && fA3 == fA4) {
                        android.graphics.RectF rectF3 = this.c;
                        rectF3.set(rectF3.left, this.c.top - fA3, this.c.right, this.c.bottom);
                        this.e = fA3;
                    } else if (fA2 == 0.0f && fA4 == 0.0f && fA == fA3) {
                        android.graphics.RectF rectF4 = this.c;
                        rectF4.set(rectF4.left, this.c.top, this.c.right + fA, this.c.bottom);
                        this.e = fA;
                    } else if (fA3 == 0.0f && fA4 == 0.0f && fA == fA2) {
                        android.graphics.RectF rectF5 = this.c;
                        rectF5.set(rectF5.left, this.c.top, this.c.right, this.c.bottom + fA);
                        this.e = fA;
                    }
                    z = true;
                }
            }
        } else {
            z = true;
        }
        this.f = z;
        view.setClipToOutline(!c());
        if (c()) {
            view.invalidate();
        } else {
            view.invalidateOutline();
        }
    }

    public final boolean c() {
        return !this.f;
    }
}
