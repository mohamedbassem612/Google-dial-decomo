package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class hfq implements defpackage.hfw {
    public static final defpackage.hfq a = new defpackage.hfq();
    private static final defpackage.kvt b = defpackage.kvt.p("c", "v", "i", "o");

    @Override // defpackage.hfw
    public final /* bridge */ /* synthetic */ java.lang.Object a(defpackage.hfz hfzVar, float f) {
        if (hfzVar.p() == 1) {
            hfzVar.g();
        }
        hfzVar.h();
        java.util.List listD = null;
        java.util.List listD2 = null;
        java.util.List listD3 = null;
        boolean zO = false;
        while (hfzVar.n()) {
            int iQ = hfzVar.q(b);
            if (iQ == 0) {
                zO = hfzVar.o();
            } else if (iQ == 1) {
                listD = defpackage.hfg.d(hfzVar, f);
            } else if (iQ == 2) {
                listD2 = defpackage.hfg.d(hfzVar, f);
            } else if (iQ != 3) {
                hfzVar.l();
                hfzVar.m();
            } else {
                listD3 = defpackage.hfg.d(hfzVar, f);
            }
        }
        hfzVar.j();
        if (hfzVar.p() == 2) {
            hfzVar.i();
        }
        if (listD == null || listD2 == null || listD3 == null) {
            throw new java.lang.IllegalArgumentException("Shape data was missing information.");
        }
        if (listD.isEmpty()) {
            return new defpackage.hdy(new android.graphics.PointF(), false, java.util.Collections.EMPTY_LIST);
        }
        int size = listD.size();
        android.graphics.PointF pointF = (android.graphics.PointF) listD.get(0);
        java.util.ArrayList arrayList = new java.util.ArrayList(size);
        for (int i = 1; i < size; i++) {
            android.graphics.PointF pointF2 = (android.graphics.PointF) listD.get(i);
            int i2 = i - 1;
            arrayList.add(new defpackage.hct(defpackage.hgh.b((android.graphics.PointF) listD.get(i2), (android.graphics.PointF) listD3.get(i2)), defpackage.hgh.b(pointF2, (android.graphics.PointF) listD2.get(i)), pointF2));
        }
        if (zO) {
            android.graphics.PointF pointF3 = (android.graphics.PointF) listD.get(0);
            int i3 = size - 1;
            arrayList.add(new defpackage.hct(defpackage.hgh.b((android.graphics.PointF) listD.get(i3), (android.graphics.PointF) listD3.get(i3)), defpackage.hgh.b(pointF3, (android.graphics.PointF) listD2.get(0)), pointF3));
        }
        return new defpackage.hdy(pointF, zO, arrayList);
    }
}
