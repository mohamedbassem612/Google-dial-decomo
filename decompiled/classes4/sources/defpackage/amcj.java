package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class amcj {
    public static final aify a = aify.u("<sos>", "<s>", "</s>", "<unk>", "<noise>", "<text_only>");
    public static final aimz b = aimz.i("com/google/quality/views/extraction/kcube/bg/ondevice/modules/vc/AmStateTextTracker");
    public final aizr c;
    public j$.util.Optional d = j$.util.Optional.empty();
    j$.util.Optional e = j$.util.Optional.empty();
    public final defpackage.alty f;

    public amcj(defpackage.alty altyVar, aizr aizrVar) {
        this.f = altyVar;
        this.c = aizrVar;
    }

    public final aify a(alqu alquVar) {
        java.lang.String str;
        int i;
        if ((alquVar.c == 1 ? (defpackage.alqm) alquVar.d : defpackage.alqm.a).b.size() > 0) {
            str = ((defpackage.alqq) (alquVar.c == 1 ? (defpackage.alqm) alquVar.d : defpackage.alqm.a).b.get(0)).c;
            i = -1;
        } else {
            str = ((defpackage.alqq) (alquVar.c == 2 ? (defpackage.alqr) alquVar.d : defpackage.alqr.a).b.get(0)).c;
            i = 0;
        }
        java.util.List listJ = ahzf.b(' ').j(str);
        if (listJ.isEmpty()) {
            return aike.a;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(java.util.Collections.nCopies(listJ.size(), 0));
        arrayList.set(listJ.size() - 1, java.lang.Integer.valueOf(i));
        return aify.n(arrayList);
    }
}
