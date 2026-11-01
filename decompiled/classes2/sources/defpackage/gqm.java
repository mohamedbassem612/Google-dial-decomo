package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class gqm implements android.hardware.input.InputManager.InputDeviceListener {
    final /* synthetic */ defpackage.gqn a;

    public gqm(defpackage.gqn gqnVar) {
        this.a = gqnVar;
    }

    @Override // android.hardware.input.InputManager.InputDeviceListener
    public final void onInputDeviceAdded(int i) {
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.a.a;
        reentrantLock.lock();
        reentrantLock.unlock();
    }

    @Override // android.hardware.input.InputManager.InputDeviceListener
    public final void onInputDeviceChanged(int i) {
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.a.a;
        reentrantLock.lock();
        reentrantLock.unlock();
    }

    @Override // android.hardware.input.InputManager.InputDeviceListener
    public final void onInputDeviceRemoved(int i) {
        defpackage.gqn gqnVar = this.a;
        java.util.concurrent.locks.ReentrantLock reentrantLock = gqnVar.a;
        reentrantLock.lock();
        try {
            java.util.Set set = gqnVar.d;
            java.lang.Integer numValueOf = java.lang.Integer.valueOf(i);
            set.remove(numValueOf);
            java.util.Set set2 = gqnVar.e;
            set2.remove(numValueOf);
            boolean zIsEmpty = set.isEmpty();
            boolean z = true;
            boolean z2 = (zIsEmpty || set2.isEmpty()) ? false : true;
            if (gqnVar.c != z2) {
                gqnVar.c = z2;
            } else {
                z = false;
            }
            reentrantLock.unlock();
            if (z) {
                defpackage.gqn gqnVar2 = this.a;
                java.util.concurrent.locks.ReentrantLock reentrantLock2 = gqnVar2.a;
                reentrantLock2.lock();
                try {
                    java.util.Map mapAS = ajsz.aS(gqnVar2.b);
                    reentrantLock2.unlock();
                    java.util.concurrent.locks.ReentrantLock reentrantLock3 = gqnVar2.a;
                    reentrantLock3.lock();
                    try {
                        boolean z3 = gqnVar2.c;
                        reentrantLock3.unlock();
                        for (java.util.Map.Entry entry : mapAS.entrySet()) {
                            ((java.util.concurrent.Executor) entry.getValue()).execute(new defpackage.gql((dxw) entry.getKey(), z3, 0));
                        }
                    } catch (java.lang.Throwable th) {
                        reentrantLock3.unlock();
                        throw th;
                    }
                } catch (java.lang.Throwable th2) {
                    reentrantLock2.unlock();
                    throw th2;
                }
            }
        } catch (java.lang.Throwable th3) {
            reentrantLock.unlock();
            throw th3;
        }
    }
}
