package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class gno implements androidx.window.reflection.Consumer2 {
    private final defpackage.gov a;
    private final defpackage.goe b;

    public gno(defpackage.gov govVar, defpackage.goe goeVar) {
        if (govVar == null) {
            defpackage.aooh.i("callback");
        }
        if (goeVar == null) {
            defpackage.aooh.i("adapter");
        }
        this.a = govVar;
        this.b = goeVar;
    }

    @Override // androidx.window.reflection.Consumer2, androidx.window.extensions.core.util.function.Consumer
    public void accept(java.util.List list) {
        defpackage.aooh.f(list, "value");
        defpackage.aooh.f(list, "activityStacks");
        java.util.ArrayList arrayList = new java.util.ArrayList(defpackage.ajsz.bl(list, 10));
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(this.b.a(ddz$.ExternalSyntheticApiModelOutline0.m(it.next())));
        }
        this.a.b();
    }
}
