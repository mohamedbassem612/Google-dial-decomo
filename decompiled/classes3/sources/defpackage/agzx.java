package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class agzx extends defpackage.agzc {
    public defpackage.agzc a = null;
    private final aw b;
    private final java.util.concurrent.Executor c;
    private final aogc d;

    public agzx(aw awVar, aogc aogcVar, java.util.concurrent.Executor executor) {
        this.b = awVar;
        this.d = aogcVar;
        this.c = executor;
    }

    @Override // defpackage.agzc
    public final defpackage.agwm g(int i, defpackage.agyz agyzVar, defpackage.agza agzaVar) {
        afec.c();
        try {
            ahvr.bZ(this.b.Q().P().d == emq.b, "A @ViewLifecycle LocalSubscriptionMixin may only register callbacks in `onCreateView()`. Please refer to the LocalSubscriptionMixin's Javadoc for a full description of how to use this LocalSubscriptionMixin correctly.");
            if (this.a == null) {
                try {
                    aw awVar = this.b;
                    defpackage.uzx uzxVarAX = defpackage.uzx.aX(awVar.Q(), awVar);
                    aw awVar2 = this.b;
                    java.util.concurrent.Executor executor = this.c;
                    this.a = new defpackage.agzk(new defpackage.agzn(new defpackage.agzh(awVar2.Q(), uzxVarAX, executor), uzxVarAX, this.d, executor, awVar2.Q()));
                    awVar2.Q().P().c(new ahrs(new zu(this, 5)));
                } catch (java.lang.IllegalStateException e) {
                    throw new java.lang.IllegalStateException("Currently a Fragment cannot inject both `@ViewLifecycle StreamMixin` and `@ViewLifecycle LocalSubscriptionMixin` at the same time. Please file go/tiktok-bug if you need it.\n\nIf this Fragment injects both unqualified and `@ViewLifecycle` qualified Mixins it's likely a bug. Only one the two Mixins may be used in a given Fragment - either the unqualified or `@ViewLifecycle` Mixin exclusively.", e);
                }
            }
            return this.a.g(i, agyzVar, agzaVar);
        } catch (java.lang.IllegalStateException e2) {
            throw new java.lang.IllegalStateException("A @ViewLifecycle LocalSubscriptionMixin may only register callbacks in `onCreateView()`. Please refer to the LocalSubscriptionMixin's Javadoc for a full description of how to use this LocalSubscriptionMixin correctly.", e2);
        }
    }
}
