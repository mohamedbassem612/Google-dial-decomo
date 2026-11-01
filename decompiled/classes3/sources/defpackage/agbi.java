package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class agbi extends ecj {
    public final defpackage.agbj f;
    final android.graphics.Rect g;

    public agbi(defpackage.agbj agbjVar) {
        super(agbjVar);
        this.g = new android.graphics.Rect();
        this.f = agbjVar;
    }

    protected final void l(java.util.List list) {
        for (int i = 0; i < this.f.d().size(); i++) {
            list.add(java.lang.Integer.valueOf(i));
        }
    }

    protected final void o(int i, ebd ebdVar) {
        ebdVar.i(ebc.q);
        defpackage.agbj agbjVar = this.f;
        java.util.List listD = agbjVar.d();
        java.lang.Float f = (java.lang.Float) listD.get(i);
        float fFloatValue = f.floatValue();
        float fFloatValue2 = agbjVar.h;
        float fFloatValue3 = agbjVar.i;
        if (agbjVar.isEnabled()) {
            if (fFloatValue > fFloatValue2) {
                ebdVar.h(8192);
            }
            if (fFloatValue < fFloatValue3) {
                ebdVar.h(4096);
            }
        }
        java.text.NumberFormat numberInstance = java.text.NumberFormat.getNumberInstance();
        numberInstance.setMaximumFractionDigits(2);
        try {
            fFloatValue2 = numberInstance.parse(numberInstance.format(fFloatValue2)).floatValue();
            fFloatValue3 = numberInstance.parse(numberInstance.format(fFloatValue3)).floatValue();
            fFloatValue = numberInstance.parse(numberInstance.format(fFloatValue)).floatValue();
        } catch (java.text.ParseException unused) {
            android.util.Log.w(defpackage.agbj.a, java.lang.String.format("Error parsing value(%s), valueFrom(%s), and valueTo(%s) into a float.", f, java.lang.Float.valueOf(fFloatValue2), java.lang.Float.valueOf(fFloatValue3)));
        }
        ebdVar.ae(ni.q(fFloatValue2, fFloatValue3, fFloatValue));
        ebdVar.s(android.widget.SeekBar.class.getName());
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        defpackage.agbj agbjVar2 = this.f;
        if (agbjVar2.getContentDescription() != null) {
            sb.append(agbjVar2.getContentDescription());
        }
        java.lang.String strC = agbjVar2.c(fFloatValue);
        java.lang.String string = agbjVar2.getContext().getString(2132019311);
        if (listD.size() > 1) {
            if (i == agbjVar2.d().size() - 1) {
                string = agbjVar2.getContext().getString(2132019309);
            } else {
                string = i == 0 ? agbjVar2.getContext().getString(2132019310) : "";
            }
        }
        int i2 = dzs.a;
        java.lang.CharSequence charSequenceB = dzq.b(agbjVar2);
        if (android.text.TextUtils.isEmpty(charSequenceB)) {
            if (!android.text.TextUtils.isEmpty(sb)) {
                sb.append(',');
            }
            sb.append(java.lang.String.format(java.util.Locale.getDefault(), "%s, %s", string, strC));
        } else {
            ebdVar.Q(charSequenceB);
        }
        ebdVar.w(sb.toString());
        android.graphics.Rect rect = this.g;
        agbjVar2.f(i, rect);
        ebdVar.o(rect);
    }

    public final boolean t(int i, int i2, android.os.Bundle bundle) {
        defpackage.agbj agbjVar = this.f;
        if (agbjVar.isEnabled()) {
            if (i2 == 4096 || i2 == 8192) {
                float fL = agbjVar.l();
                if (i2 == 8192) {
                    fL = -fL;
                }
                if (agbjVar.i()) {
                    fL = -fL;
                }
                if (agbjVar.k(i, dzk.A(((java.lang.Float) agbjVar.d().get(i)).floatValue() + fL, agbjVar.h, agbjVar.i))) {
                    agbjVar.j = i;
                    java.lang.Runnable runnable = agbjVar.m;
                    agbjVar.removeCallbacks(runnable);
                    agbjVar.postDelayed(runnable, agbjVar.l);
                    agbjVar.g();
                    agbjVar.postInvalidate();
                    return true;
                }
            } else if (i2 == 16908349 && bundle != null && bundle.containsKey("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE") && agbjVar.k(i, bundle.getFloat("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE"))) {
                agbjVar.g();
                agbjVar.postInvalidate();
                return true;
            }
        }
        return false;
    }
}
