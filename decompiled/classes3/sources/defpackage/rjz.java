package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class rjz implements aoxi, aood {
    private final /* synthetic */ int $cid;
    final /* synthetic */ aonj a;

    public rjz(aonj aonjVar, int i) {
        this.$cid = i;
        this.a = aonjVar;
    }

    public final java.lang.Object a(java.lang.Object obj, aoln aolnVar) {
        int i = this.$cid;
        aonj aonjVar = this.a;
        if (i != 0) {
            aonjVar.a(obj);
            return aojh.a;
        }
        aonjVar.a(obj);
        return aojh.a;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this.$cid != 0) {
            if ((obj instanceof aoxi) && (obj instanceof aood)) {
                return aooh.n(ex(), ((aood) obj).ex());
            }
            return false;
        }
        if ((obj instanceof aoxi) && (obj instanceof aood)) {
            return aooh.n(ex(), ((aood) obj).ex());
        }
        return false;
    }

    public final aoio ex() {
        int i = this.$cid;
        aonj aonjVar = this.a;
        return i != 0 ? new aoof(2, aonjVar, aoog.class, "suspendConversion0", "suspendConversion0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0) : new aoof(2, aonjVar, aoog.class, "suspendConversion0", "suspendConversion0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    public final int hashCode() {
        int i = this.$cid;
        aoio aoioVarEx = ex();
        return i != 0 ? aoioVarEx.hashCode() : aoioVarEx.hashCode();
    }
}
