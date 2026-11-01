package j$.util.concurrent;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final class i extends j$.util.concurrent.o implements j$.util.Spliterator {
    public final /* synthetic */ byte i;
    public long j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(j$.util.concurrent.k[] kVarArr, int i, int i2, int i3, long j, byte b) {
        super(kVarArr, i, i2, i3);
        this.i = b;
        this.j = j;
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        switch (this.i) {
            case 0:
                return 4353;
            default:
                return 4352;
        }
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        switch (this.i) {
            case 0:
                break;
            default:
                break;
        }
        return this.j;
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(java.util.function.Consumer consumer) {
        switch (this.i) {
            case 0:
                consumer.getClass();
                while (true) {
                    j$.util.concurrent.k kVarA = a();
                    if (kVarA != null) {
                        consumer.accept(kVarA.b);
                    }
                    break;
                }
                break;
            default:
                consumer.getClass();
                while (true) {
                    j$.util.concurrent.k kVarA2 = a();
                    if (kVarA2 != null) {
                        consumer.accept(kVarA2.c);
                    }
                    break;
                }
                break;
        }
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ java.util.Comparator getComparator() {
        switch (this.i) {
            case 0:
                break;
            default:
                break;
        }
        return j$.util.Spliterator.CC.$default$getComparator(this);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        switch (this.i) {
            case 0:
                break;
            default:
                break;
        }
        return j$.util.Spliterator.CC.$default$getExactSizeIfKnown(this);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        switch (this.i) {
            case 0:
                break;
            default:
                break;
        }
        return j$.util.Spliterator.CC.$default$hasCharacteristics(this, i);
    }

    @Override // j$.util.Spliterator
    public final boolean tryAdvance(java.util.function.Consumer consumer) {
        switch (this.i) {
            case 0:
                consumer.getClass();
                j$.util.concurrent.k kVarA = a();
                if (kVarA != null) {
                    consumer.accept(kVarA.b);
                    return true;
                }
                break;
            default:
                consumer.getClass();
                j$.util.concurrent.k kVarA2 = a();
                if (kVarA2 != null) {
                    consumer.accept(kVarA2.c);
                    return true;
                }
                break;
        }
        return false;
    }

    @Override // j$.util.Spliterator
    public final j$.util.Spliterator trySplit() {
        j$.util.concurrent.i iVar;
        switch (this.i) {
            case 0:
                int i = this.f;
                int i2 = this.g;
                int i3 = (i + i2) >>> 1;
                if (i3 > i) {
                    j$.util.concurrent.k[] kVarArr = this.a;
                    this.g = i3;
                    long j = this.j >>> 1;
                    this.j = j;
                    iVar = new j$.util.concurrent.i(kVarArr, this.h, i3, i2, j, (byte) 0);
                    return iVar;
                }
                return null;
            default:
                int i4 = this.f;
                int i5 = this.g;
                int i6 = (i4 + i5) >>> 1;
                if (i6 > i4) {
                    j$.util.concurrent.k[] kVarArr2 = this.a;
                    this.g = i6;
                    long j2 = this.j >>> 1;
                    this.j = j2;
                    iVar = new j$.util.concurrent.i(kVarArr2, this.h, i6, i5, j2, (byte) 1);
                    return iVar;
                }
                return null;
        }
    }
}
