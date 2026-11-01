package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class aiio extends defpackage.aili {
    final /* synthetic */ defpackage.aiip a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aiio(defpackage.aiip aiipVar, java.util.ListIterator listIterator) {
        super(listIterator);
        j$.util.Objects.requireNonNull(aiipVar);
        this.a = aiipVar;
    }

    public final java.lang.Object a(java.lang.Object obj) {
        return this.a.b.apply(obj);
    }
}
