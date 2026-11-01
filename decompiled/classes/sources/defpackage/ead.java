package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class ead extends android.view.WindowInsetsAnimation.Callback {
    private final defpackage.eac a;
    private java.util.List b;
    private java.util.ArrayList c;
    private final java.util.HashMap d;

    public ead(defpackage.eac eacVar) {
        super(eacVar.d);
        this.d = new java.util.HashMap();
        this.a = eacVar;
    }

    private final defpackage.aiyy a(android.view.WindowInsetsAnimation windowInsetsAnimation) {
        java.util.HashMap map = this.d;
        defpackage.aiyy aiyyVar = (defpackage.aiyy) map.get(windowInsetsAnimation);
        if (aiyyVar != null) {
            return aiyyVar;
        }
        defpackage.aiyy aiyyVar2 = new defpackage.aiyy(windowInsetsAnimation);
        map.put(windowInsetsAnimation, aiyyVar2);
        return aiyyVar2;
    }

    @Override // android.view.WindowInsetsAnimation.Callback
    public final void onEnd(android.view.WindowInsetsAnimation windowInsetsAnimation) {
        this.a.d(a(windowInsetsAnimation));
        this.d.remove(windowInsetsAnimation);
    }

    @Override // android.view.WindowInsetsAnimation.Callback
    public final void onPrepare(android.view.WindowInsetsAnimation windowInsetsAnimation) {
        this.a.e(a(windowInsetsAnimation));
    }

    @Override // android.view.WindowInsetsAnimation.Callback
    public final android.view.WindowInsets onProgress(android.view.WindowInsets windowInsets, java.util.List list) {
        java.util.ArrayList arrayList = this.c;
        if (arrayList == null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList(list.size());
            this.c = arrayList2;
            this.b = j$.util.DesugarCollections.unmodifiableList(arrayList2);
        } else {
            arrayList.clear();
        }
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                return this.a.b(defpackage.eax.q(windowInsets, null), this.b).e();
            }
            android.view.WindowInsetsAnimation windowInsetsAnimationM = baa$.ExternalSyntheticApiModelOutline1.m(list.get(size));
            defpackage.aiyy aiyyVarA = a(windowInsetsAnimationM);
            baa$.ExternalSyntheticApiModelOutline1.m(((defpackage.eae) aiyyVarA.a).a, baa$.ExternalSyntheticApiModelOutline1.m$1(windowInsetsAnimationM));
            this.c.add(aiyyVarA);
        }
    }

    @Override // android.view.WindowInsetsAnimation.Callback
    public final android.view.WindowInsetsAnimation.Bounds onStart(android.view.WindowInsetsAnimation windowInsetsAnimation, android.view.WindowInsetsAnimation.Bounds bounds) {
        eab eabVarC = this.a.c(a(windowInsetsAnimation), new eab(bounds));
        return new android.view.WindowInsetsAnimation.Bounds(eabVarC.a.a(), eabVarC.b.a());
    }
}
