package com.google.android.libraries.surveys.internal.view;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class SurveyViewPager extends androidx.viewpager.widget.ViewPager {
    public defpackage.aflw t;

    public SurveyViewPager(android.content.Context context) {
        super(context);
        G();
    }

    private final android.view.View F() {
        defpackage.afke afkeVarX;
        if (((androidx.viewpager.widget.ViewPager) this).c == null || (afkeVarX = x()) == null) {
            return null;
        }
        return ((aw) afkeVarX).Q;
    }

    private final void G() {
        defpackage.afmb afmbVar = new defpackage.afmb(this);
        g(afmbVar);
        post(new defpackage.aekf(this, afmbVar, 14, null));
    }

    public final void A(int i) {
        n(i, true);
        x().f();
    }

    public final void B(java.lang.String str) {
        defpackage.afke afkeVarX = x();
        if (afkeVarX != null) {
            afkeVarX.q(str);
        } else {
            post(new defpackage.aekf(this, str, 13));
        }
    }

    public final boolean C() {
        return ((androidx.viewpager.widget.ViewPager) this).d == 0;
    }

    public final boolean D() {
        defpackage.afmc afmcVar = ((androidx.viewpager.widget.ViewPager) this).c;
        if (afmcVar == null) {
            android.util.Log.e("SurveyViewPager", "Error, survey view pager adapter is null!");
            return false;
        }
        if (!afjy.a() || x() == null || afmcVar.m(((androidx.viewpager.widget.ViewPager) this).d) == null || (afmcVar.m(((androidx.viewpager.widget.ViewPager) this).d).b & 1) == 0) {
            aehj aehjVar = afjy.c;
            if (afjy.c(defpackage.anlf.c(afjy.b))) {
                if (((androidx.viewpager.widget.ViewPager) this).d != afmcVar.i() - (afmcVar.c == defpackage.afiz.a ? 2 : 1)) {
                    return false;
                }
            } else if (((androidx.viewpager.widget.ViewPager) this).d != afmcVar.i() - 2) {
                return false;
            }
        } else {
            defpackage.amiu amiuVar = ((androidx.viewpager.widget.ViewPager) this).c.m(((androidx.viewpager.widget.ViewPager) this).d).k;
            if (amiuVar == null) {
                amiuVar = defpackage.amiu.a;
            }
            amho amhoVar = amiuVar.d;
            if (amhoVar == null) {
                amhoVar = amho.a;
            }
            int iW = a.W(amhoVar.b);
            if (iW == 0 || iW != 5) {
                return false;
            }
        }
        return true;
    }

    public final boolean E() {
        aehj aehjVar = afjy.c;
        if (afjy.c(defpackage.anlf.c(afjy.b))) {
            defpackage.afmc afmcVar = ((androidx.viewpager.widget.ViewPager) this).c;
            if (afmcVar == null) {
                android.util.Log.e("SurveyViewPager", "Error, survey view pager adapter is null!");
            } else {
                if (((defpackage.aflx) afmcVar.b.get(((androidx.viewpager.widget.ViewPager) this).d)).b == 5) {
                    return true;
                }
            }
        } else if (((androidx.viewpager.widget.ViewPager) this).d == ((androidx.viewpager.widget.ViewPager) this).c.i() - 1) {
            return true;
        }
        return false;
    }

    public final boolean dispatchKeyEvent(android.view.KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        switch (keyCode) {
            default:
                switch (keyCode) {
                    case 268:
                    case 269:
                    case 270:
                    case 271:
                        break;
                    default:
                        return super.dispatchKeyEvent(keyEvent);
                }
            case 19:
            case 20:
            case 21:
            case 22:
                return false;
        }
    }

    public final boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected final void onMeasure(int i, int i2) {
        aehj aehjVar = afjy.c;
        if (afjy.c(defpackage.anlf.a.eZ().a(afjy.b))) {
            android.view.View viewF = F();
            if (viewF == null) {
                super.onMeasure(i, i2);
                return;
            }
            defpackage.aflw aflwVar = this.t;
            android.view.View viewFindViewById = aflwVar != null ? aflwVar.b().findViewById(2131429157) : null;
            defpackage.aflw aflwVar2 = this.t;
            super.onMeasure(i, defpackage.afjs.b(this, viewF, i, i2, viewF.findViewById(2131429185), viewFindViewById, aflwVar2 == null || aflwVar2.aW()));
            return;
        }
        if (getChildCount() == 0) {
            super.onMeasure(i, i2);
        }
        android.view.View viewF2 = F();
        if (viewF2 == null) {
            super.onMeasure(i, i2);
            return;
        }
        viewF2.measure(i, 0);
        int measuredHeight = viewF2.getMeasuredHeight();
        android.graphics.Rect rect = new android.graphics.Rect();
        viewF2.getWindowVisibleDisplayFrame(rect);
        super.onMeasure(i, android.view.View.MeasureSpec.makeMeasureSpec(java.lang.Math.min(measuredHeight, (rect.height() - viewF2.findViewById(2131429185).getHeight()) - (getResources().getDimensionPixelSize(2131167815) << 1)), 1073741824));
    }

    public final boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        return false;
    }

    public final defpackage.afke x() {
        defpackage.aflw aflwVar = this.t;
        if (aflwVar != null) {
            int i = ((androidx.viewpager.widget.ViewPager) this).d;
            for (aw awVar : aflwVar.a().k()) {
                if (defpackage.afmc.k(awVar) == i && (awVar instanceof defpackage.afke)) {
                    return (defpackage.afke) awVar;
                }
            }
        }
        return null;
    }

    public final amig y() {
        defpackage.afke afkeVarX = x();
        if (afkeVarX == null) {
            return null;
        }
        return afkeVarX.c();
    }

    public final void z() {
        n(((androidx.viewpager.widget.ViewPager) this).c.i() - 1, true);
        x().f();
    }

    public SurveyViewPager(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        G();
    }
}
