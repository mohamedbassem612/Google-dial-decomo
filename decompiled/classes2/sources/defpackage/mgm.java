package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class mgm implements mfx {
    public final /* synthetic */ mgq a;
    public final /* synthetic */ java.util.function.Function b;

    public /* synthetic */ mgm(mgq mgqVar, java.util.function.Function function) {
        this.a = mgqVar;
        this.b = function;
    }

    public final j$.util.Optional a(java.lang.Object obj) {
        j$.util.Optional optional = (j$.util.Optional) obj;
        defpackage.mgp mgpVar = new defpackage.mgp(this.b);
        if (true != optional.isPresent()) {
            return optional;
        }
        return j$.util.Optional.ofNullable(new kaw((mhc) aa$.ExternalSyntheticApiModelOutline1.m(mgpVar.a, optional.get())));
    }
}
