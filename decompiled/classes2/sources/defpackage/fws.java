package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class fws extends eoa {
    public final java.lang.String a;
    public defpackage.vk b;
    private final java.lang.String c = "SaveableStateHolder_BackStackEntryKey";

    public fws(enr enrVar) {
        java.lang.String string = (java.lang.String) enrVar.a("SaveableStateHolder_BackStackEntryKey");
        if (string == null) {
            string = java.util.UUID.randomUUID().toString();
            enrVar.d("SaveableStateHolder_BackStackEntryKey", string);
        }
        this.a = string;
    }

    public final defpackage.vk a() {
        defpackage.vk vkVar = this.b;
        if (vkVar != null) {
            return vkVar;
        }
        aooh.j("saveableStateHolderRef");
        return null;
    }

    protected final void d() {
        cjt cjtVar = (cjt) ((java.lang.ref.WeakReference) a().a).get();
        if (cjtVar != null) {
            cjtVar.d(this.a);
        }
        ((java.lang.ref.WeakReference) a().a).clear();
    }
}
