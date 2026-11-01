package j$.nio.file;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final class e0 implements j$.nio.file.i0, java.util.function.BiConsumer, java.util.function.BiFunction, java.util.function.Consumer, java.util.function.Supplier, j$.util.stream.j9 {
    public final /* synthetic */ byte a;
    public final java.lang.Object b;
    public final java.lang.Object c;

    public e0(j$.util.stream.w7 w7Var, j$.util.stream.h2 h2Var, java.util.function.Supplier supplier) {
        this.a = (byte) 9;
        this.b = h2Var;
        this.c = supplier;
    }

    @Override // j$.util.stream.j9
    public final java.lang.Object a(j$.util.stream.a aVar, j$.util.Spliterator spliterator) {
        j$.util.stream.g2 g2Var = (j$.util.stream.g2) ((java.util.function.Supplier) this.c).get();
        aVar.O(spliterator, g2Var);
        return java.lang.Boolean.valueOf(g2Var.b);
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final void r(java.lang.Object obj) {
        byte b = this.a;
        java.lang.Object obj2 = this.c;
        java.lang.Object obj3 = this.b;
        switch (b) {
            case 4:
                ((java.util.function.Consumer) obj3).r(obj);
                ((java.util.function.Consumer) obj2).r(obj);
                break;
            case 6:
                java.util.concurrent.atomic.AtomicBoolean atomicBoolean = (java.util.concurrent.atomic.AtomicBoolean) obj3;
                j$.util.concurrent.ConcurrentHashMap concurrentHashMap = (j$.util.concurrent.ConcurrentHashMap) obj2;
                if (obj != null) {
                    concurrentHashMap.putIfAbsent(obj, java.lang.Boolean.TRUE);
                } else {
                    atomicBoolean.set(true);
                }
                break;
            case 10:
                ((java.util.function.BiConsumer) obj3).accept(obj2, obj);
                break;
            default:
                java.util.function.Consumer consumer = (java.util.function.Consumer) obj2;
                if (((j$.util.stream.j8) obj3).b.putIfAbsent(obj != null ? obj : j$.util.stream.j8.d, java.lang.Boolean.TRUE) == null) {
                    consumer.r(obj);
                }
                break;
        }
    }

    public final /* synthetic */ java.util.function.Consumer andThen(java.util.function.Consumer consumer) {
        switch (this.a) {
            case 4:
                break;
            case 6:
                break;
            case 10:
                break;
            default:
                break;
        }
        return j$.util.function.Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // java.util.function.BiFunction
    public final java.lang.Object apply(java.lang.Object obj, java.lang.Object obj2) {
        return ((java.util.function.Function) this.c).apply(((java.util.function.BiFunction) this.b).apply(obj, obj2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // j$.util.stream.j9
    public final java.lang.Object b(j$.util.stream.a aVar, j$.util.Spliterator spliterator) {
        return (java.lang.Boolean) new j$.util.stream.i2(this, aVar, spliterator).invoke();
    }

    @Override // j$.util.stream.j9
    public final int c() {
        return j$.util.stream.v7.u | j$.util.stream.v7.r;
    }

    @Override // java.util.function.Supplier
    public final java.lang.Object get() {
        switch (this.a) {
            case 7:
                return new j$.util.stream.d2((j$.util.stream.h2) this.b, (java.util.function.IntPredicate) this.c);
            default:
                return new j$.util.stream.c2((j$.util.stream.h2) this.b, (java.util.function.Predicate) this.c);
        }
    }

    @Override // j$.nio.file.i0
    public final java.lang.String name() {
        return (java.lang.String) this.b;
    }

    public final java.lang.String toString() {
        switch (this.a) {
            case 0:
                return (java.lang.String) this.b;
            default:
                return super.toString();
        }
    }

    @Override // j$.nio.file.i0
    public final java.lang.Class type() {
        return (java.lang.Class) this.c;
    }

    public /* synthetic */ e0(java.lang.Object obj, java.lang.Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    public final /* synthetic */ java.util.function.BiFunction andThen(java.util.function.Function function) {
        return j$.util.function.BiFunction$CC.$default$andThen(this, function);
    }

    public final /* synthetic */ java.util.function.BiConsumer andThen(java.util.function.BiConsumer biConsumer) {
        switch (this.a) {
            case 1:
                break;
            case 2:
                break;
            default:
                break;
        }
        return j$.util.function.BiConsumer$CC.$default$andThen(this, biConsumer);
    }

    @Override // java.util.function.BiConsumer
    public final void accept(java.lang.Object obj, java.lang.Object obj2) {
        byte b = this.a;
        java.lang.Object obj3 = this.c;
        java.lang.Object obj4 = this.b;
        switch (b) {
            case 1:
                java.util.concurrent.ConcurrentMap concurrentMap = (java.util.concurrent.ConcurrentMap) obj4;
                java.util.function.BiFunction biFunction = (java.util.function.BiFunction) obj3;
                while (!concurrentMap.replace(obj, obj2, biFunction.apply(obj, obj2)) && (obj2 = concurrentMap.get(obj)) != null) {
                }
                break;
            case 2:
                ((java.util.function.BiConsumer) obj4).accept(obj, obj2);
                ((java.util.function.BiConsumer) obj3).accept(obj, obj2);
                break;
            default:
                java.util.function.BiConsumer biConsumer = (java.util.function.BiConsumer) obj4;
                j$.util.stream.o oVar = (j$.util.stream.o) obj;
                java.util.Set set = j$.util.stream.Collectors.a;
                biConsumer.accept(((java.util.function.Predicate) obj3).test(obj2) ? oVar.a : oVar.b, obj2);
                break;
        }
    }
}
