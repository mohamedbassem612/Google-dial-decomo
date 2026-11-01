package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class agtd {
    private final java.util.Deque a;
    private final java.util.function.Consumer b;
    private final int c;

    public agtd(int i, java.util.function.Consumer consumer) {
        this.c = i;
        this.b = consumer;
        this.a = new java.util.ArrayDeque(i);
    }

    public final void a() {
        while (true) {
            java.lang.Object objPoll = this.a.poll();
            if (objPoll == null) {
                return;
            } else {
                aa$.ExternalSyntheticApiModelOutline1.m(this.b, objPoll);
            }
        }
    }

    public final boolean b() {
        return this.a.isEmpty();
    }

    public final boolean c(java.lang.Object obj) {
        java.util.Deque deque = this.a;
        java.util.ArrayDeque arrayDeque = new java.util.ArrayDeque(deque.size());
        while (deque.peek() != null && deque.peek() != obj) {
            arrayDeque.add(deque.poll());
        }
        if (deque.peek() != obj) {
            while (true) {
                java.lang.Object objPollLast = arrayDeque.pollLast();
                if (objPollLast == null) {
                    return false;
                }
                deque.addFirst(objPollLast);
            }
        } else {
            deque.poll();
            while (true) {
                java.lang.Object objPoll = arrayDeque.poll();
                if (objPoll == null) {
                    return true;
                }
                aa$.ExternalSyntheticApiModelOutline1.m(this.b, objPoll);
            }
        }
    }

    public final void d(java.lang.Object obj) {
        java.util.Deque deque = this.a;
        java.util.ArrayDeque arrayDeque = new java.util.ArrayDeque(deque.size());
        while (true) {
            java.lang.Object objPoll = deque.poll();
            if (objPoll == null) {
                break;
            } else if (arrayDeque.size() < this.c - 1) {
                arrayDeque.add(objPoll);
            } else {
                aa$.ExternalSyntheticApiModelOutline1.m(this.b, objPoll);
            }
        }
        while (true) {
            java.lang.Object objPoll2 = arrayDeque.poll();
            if (objPoll2 == null) {
                deque.add(obj);
                return;
            }
            deque.add(objPoll2);
        }
    }
}
