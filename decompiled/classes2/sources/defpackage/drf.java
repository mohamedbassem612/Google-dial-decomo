package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class drf extends eac {
    final /* synthetic */ defpackage.drg a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public drf(defpackage.drg drgVar) {
        super(1);
        this.a = drgVar;
    }

    public final eax b(eax eaxVar, java.util.List list) {
        defpackage.drg drgVar = this.a;
        if (drgVar.c) {
            return eaxVar;
        }
        int i = 0;
        android.view.View childAt = drgVar.getChildAt(0);
        int iMax = java.lang.Math.max(0, childAt.getLeft());
        int iMax2 = java.lang.Math.max(0, childAt.getTop());
        int iMax3 = java.lang.Math.max(0, drgVar.getWidth() - childAt.getRight());
        int iMax4 = java.lang.Math.max(0, drgVar.getHeight() - childAt.getBottom());
        if (iMax != 0) {
            i = iMax;
        } else if (iMax2 == 0) {
            if (iMax3 != 0) {
                iMax2 = 0;
            } else {
                if (iMax4 == 0) {
                    return eaxVar;
                }
                iMax2 = 0;
                iMax3 = 0;
            }
        }
        return eaxVar.o(i, iMax2, iMax3, iMax4);
    }

    public final eab c(aiyy aiyyVar, eab eabVar) {
        defpackage.drg drgVar = this.a;
        if (drgVar.c) {
            return eabVar;
        }
        int i = 0;
        android.view.View childAt = drgVar.getChildAt(0);
        int iMax = java.lang.Math.max(0, childAt.getLeft());
        int iMax2 = java.lang.Math.max(0, childAt.getTop());
        int iMax3 = java.lang.Math.max(0, drgVar.getWidth() - childAt.getRight());
        int iMax4 = java.lang.Math.max(0, drgVar.getHeight() - childAt.getBottom());
        if (iMax != 0) {
            i = iMax;
        } else if (iMax2 == 0) {
            if (iMax3 != 0) {
                iMax2 = 0;
            } else {
                if (iMax4 == 0) {
                    return eabVar;
                }
                iMax2 = 0;
                iMax3 = 0;
            }
        }
        dwn dwnVar = eabVar.a;
        dwn dwnVarD = dwn.d(i, iMax2, iMax3, iMax4);
        int i2 = dwnVarD.b;
        int i3 = dwnVarD.c;
        int i4 = dwnVarD.d;
        int i5 = dwnVarD.e;
        return new eab(eax.j(dwnVar, i2, i3, i4, i5), eax.j(eabVar.b, i2, i3, i4, i5));
    }
}
