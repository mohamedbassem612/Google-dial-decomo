package j$.util.concurrent;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final class t implements j$.util.Spliterator {
    public j$.util.concurrent.ConcurrentLinkedQueue.Node a;
    public int b;
    public boolean c;
    public final /* synthetic */ j$.util.concurrent.ConcurrentLinkedQueue d;

    public t(j$.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue) {
        this.d = concurrentLinkedQueue;
    }

    public final j$.util.concurrent.ConcurrentLinkedQueue.Node a() {
        j$.util.concurrent.ConcurrentLinkedQueue.Node nodeB = this.a;
        if (nodeB == null && !this.c) {
            nodeB = this.d.b();
            this.a = nodeB;
            if (nodeB == null) {
                this.c = true;
            }
        }
        return nodeB;
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return 4368;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        return Long.MAX_VALUE;
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(java.util.function.Consumer consumer) {
        j$.util.Objects.requireNonNull(consumer);
        j$.util.concurrent.ConcurrentLinkedQueue.Node nodeA = a();
        if (nodeA != null) {
            this.a = null;
            this.c = true;
            this.d.c(consumer, nodeA);
        }
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ java.util.Comparator getComparator() {
        return j$.util.Spliterator.CC.$default$getComparator(this);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return j$.util.Spliterator.CC.$default$getExactSizeIfKnown(this);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return j$.util.Spliterator.CC.$default$hasCharacteristics(this, i);
    }

    @Override // j$.util.Spliterator
    public final boolean tryAdvance(java.util.function.Consumer consumer) {
        E e;
        j$.util.Objects.requireNonNull(consumer);
        j$.util.concurrent.ConcurrentLinkedQueue.Node nodeA = a();
        if (nodeA != null) {
            do {
                e = nodeA.item;
                j$.util.concurrent.ConcurrentLinkedQueue.Node node = nodeA.next;
                nodeA = nodeA == node ? this.d.b() : node;
                if (e != 0) {
                    break;
                }
            } while (nodeA != null);
            this.a = nodeA;
            if (nodeA == null) {
                this.c = true;
            }
            if (e != 0) {
                consumer.accept(e);
                return true;
            }
        }
        return false;
    }

    @Override // j$.util.Spliterator
    public final j$.util.Spliterator trySplit() {
        j$.util.concurrent.ConcurrentLinkedQueue.Node node;
        j$.util.concurrent.ConcurrentLinkedQueue.Node nodeA = a();
        if (nodeA == null || (node = nodeA.next) == null) {
            return null;
        }
        int iMin = java.lang.Math.min(this.b + 1, 33554432);
        this.b = iMin;
        java.lang.Object[] objArr = null;
        int i = 0;
        do {
            java.lang.Object obj = nodeA.item;
            if (obj != null) {
                if (objArr == null) {
                    objArr = new java.lang.Object[iMin];
                }
                objArr[i] = obj;
                i++;
            }
            nodeA = nodeA == node ? this.d.b() : node;
            if (nodeA == null || (node = nodeA.next) == null) {
                break;
            }
        } while (i < iMin);
        this.a = nodeA;
        if (nodeA == null) {
            this.c = true;
        }
        if (i != 0) {
            return j$.util.Spliterators.b(objArr, 0, i, 4368);
        }
        return null;
    }
}
