package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class acbm extends aomd {
    public java.lang.Object a;
    public java.lang.Object b;
    public /* synthetic */ java.lang.Object c;
    final /* synthetic */ com.google.android.libraries.internal.growth.growthkit.internal.debug.TestingToolsBroadcastReceiver d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public acbm(com.google.android.libraries.internal.growth.growthkit.internal.debug.TestingToolsBroadcastReceiver testingToolsBroadcastReceiver, aoln aolnVar) {
        super(aolnVar);
        this.d = testingToolsBroadcastReceiver;
    }

    public final java.lang.Object b(java.lang.Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.q(null, null, this);
    }
}
