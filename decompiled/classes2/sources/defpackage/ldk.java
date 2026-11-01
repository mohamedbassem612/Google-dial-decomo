package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class ldk implements java.util.concurrent.Callable {
    public final /* synthetic */ defpackage.ldn a;

    @Override // java.util.concurrent.Callable
    public final java.lang.Object call() {
        defpackage.ldn ldnVar = this.a;
        long j = ldnVar.m - ldnVar.l;
        long j2 = ldnVar.k;
        if (j < 0 || j2 < 0) {
            throw new java.lang.IllegalStateException("session duration or num conversation must be > 0");
        }
        java.util.List list = ldnVar.c;
        java.util.List list2 = ldnVar.b;
        java.util.List list3 = ldnVar.a;
        java.lang.String str = ldnVar.f;
        final int i = 1;
        final int i2 = 0;
        j$.util.LongSummaryStatistics longSummaryStatistics = (j$.util.LongSummaryStatistics) j$.util.Collection.-EL.stream(list3).collect(new defpackage.iaz(8), new java.util.function.BiConsumer() { // from class: ldo
            @Override // java.util.function.BiConsumer
            public final void accept(java.lang.Object obj, java.lang.Object obj2) {
                int i3 = i;
                if (i3 == 0) {
                    ((j$.util.LongSummaryStatistics) obj).combine((j$.util.LongSummaryStatistics) obj2);
                    return;
                }
                if (i3 == 1) {
                    ((j$.util.LongSummaryStatistics) obj).accept(((java.lang.Long) obj2).longValue());
                    return;
                }
                if (i3 == 2) {
                    ((j$.util.DoubleSummaryStatistics) obj).accept(((java.lang.Double) obj2).doubleValue());
                    return;
                }
                if (i3 == 3) {
                    ((j$.util.DoubleSummaryStatistics) obj).combine((j$.util.DoubleSummaryStatistics) obj2);
                    return;
                }
                if (i3 == 4) {
                    ((j$.util.IntSummaryStatistics) obj).accept(((java.lang.Integer) obj2).intValue());
                } else if (i3 == 5) {
                    ((j$.util.IntSummaryStatistics) obj).combine((j$.util.IntSummaryStatistics) obj2);
                } else {
                    aesp.b(((aesr) obj).b());
                }
            }

            @Override // java.util.function.BiConsumer
            public final /* synthetic */ java.util.function.BiConsumer andThen(java.util.function.BiConsumer biConsumer) {
                int i3 = i;
                if (i3 == 0) {
                    return j$.util.function.BiConsumer.-CC.$default$andThen(this, biConsumer);
                }
                if (i3 == 1) {
                    return j$.util.function.BiConsumer.-CC.$default$andThen(this, biConsumer);
                }
                if (i3 == 2) {
                    return j$.util.function.BiConsumer.-CC.$default$andThen(this, biConsumer);
                }
                if (i3 == 3) {
                    return j$.util.function.BiConsumer.-CC.$default$andThen(this, biConsumer);
                }
                if (i3 != 4) {
                    return i3 != 5 ? j$.util.function.BiConsumer.-CC.$default$andThen(this, biConsumer) : j$.util.function.BiConsumer.-CC.$default$andThen(this, biConsumer);
                }
                return j$.util.function.BiConsumer.-CC.$default$andThen(this, biConsumer);
            }
        }, new java.util.function.BiConsumer() { // from class: ldo
            @Override // java.util.function.BiConsumer
            public final void accept(java.lang.Object obj, java.lang.Object obj2) {
                int i3 = i2;
                if (i3 == 0) {
                    ((j$.util.LongSummaryStatistics) obj).combine((j$.util.LongSummaryStatistics) obj2);
                    return;
                }
                if (i3 == 1) {
                    ((j$.util.LongSummaryStatistics) obj).accept(((java.lang.Long) obj2).longValue());
                    return;
                }
                if (i3 == 2) {
                    ((j$.util.DoubleSummaryStatistics) obj).accept(((java.lang.Double) obj2).doubleValue());
                    return;
                }
                if (i3 == 3) {
                    ((j$.util.DoubleSummaryStatistics) obj).combine((j$.util.DoubleSummaryStatistics) obj2);
                    return;
                }
                if (i3 == 4) {
                    ((j$.util.IntSummaryStatistics) obj).accept(((java.lang.Integer) obj2).intValue());
                } else if (i3 == 5) {
                    ((j$.util.IntSummaryStatistics) obj).combine((j$.util.IntSummaryStatistics) obj2);
                } else {
                    aesp.b(((aesr) obj).b());
                }
            }

            @Override // java.util.function.BiConsumer
            public final /* synthetic */ java.util.function.BiConsumer andThen(java.util.function.BiConsumer biConsumer) {
                int i3 = i2;
                if (i3 == 0) {
                    return j$.util.function.BiConsumer.-CC.$default$andThen(this, biConsumer);
                }
                if (i3 == 1) {
                    return j$.util.function.BiConsumer.-CC.$default$andThen(this, biConsumer);
                }
                if (i3 == 2) {
                    return j$.util.function.BiConsumer.-CC.$default$andThen(this, biConsumer);
                }
                if (i3 == 3) {
                    return j$.util.function.BiConsumer.-CC.$default$andThen(this, biConsumer);
                }
                if (i3 != 4) {
                    return i3 != 5 ? j$.util.function.BiConsumer.-CC.$default$andThen(this, biConsumer) : j$.util.function.BiConsumer.-CC.$default$andThen(this, biConsumer);
                }
                return j$.util.function.BiConsumer.-CC.$default$andThen(this, biConsumer);
            }
        });
        final int i3 = 2;
        final int i4 = 3;
        j$.util.DoubleSummaryStatistics doubleSummaryStatistics = (j$.util.DoubleSummaryStatistics) j$.util.Collection.-EL.stream(list2).collect(new defpackage.iaz(9), new java.util.function.BiConsumer() { // from class: ldo
            @Override // java.util.function.BiConsumer
            public final void accept(java.lang.Object obj, java.lang.Object obj2) {
                int i5 = i3;
                if (i5 == 0) {
                    ((j$.util.LongSummaryStatistics) obj).combine((j$.util.LongSummaryStatistics) obj2);
                    return;
                }
                if (i5 == 1) {
                    ((j$.util.LongSummaryStatistics) obj).accept(((java.lang.Long) obj2).longValue());
                    return;
                }
                if (i5 == 2) {
                    ((j$.util.DoubleSummaryStatistics) obj).accept(((java.lang.Double) obj2).doubleValue());
                    return;
                }
                if (i5 == 3) {
                    ((j$.util.DoubleSummaryStatistics) obj).combine((j$.util.DoubleSummaryStatistics) obj2);
                    return;
                }
                if (i5 == 4) {
                    ((j$.util.IntSummaryStatistics) obj).accept(((java.lang.Integer) obj2).intValue());
                } else if (i5 == 5) {
                    ((j$.util.IntSummaryStatistics) obj).combine((j$.util.IntSummaryStatistics) obj2);
                } else {
                    aesp.b(((aesr) obj).b());
                }
            }

            @Override // java.util.function.BiConsumer
            public final /* synthetic */ java.util.function.BiConsumer andThen(java.util.function.BiConsumer biConsumer) {
                int i5 = i3;
                if (i5 == 0) {
                    return j$.util.function.BiConsumer.-CC.$default$andThen(this, biConsumer);
                }
                if (i5 == 1) {
                    return j$.util.function.BiConsumer.-CC.$default$andThen(this, biConsumer);
                }
                if (i5 == 2) {
                    return j$.util.function.BiConsumer.-CC.$default$andThen(this, biConsumer);
                }
                if (i5 == 3) {
                    return j$.util.function.BiConsumer.-CC.$default$andThen(this, biConsumer);
                }
                if (i5 != 4) {
                    return i5 != 5 ? j$.util.function.BiConsumer.-CC.$default$andThen(this, biConsumer) : j$.util.function.BiConsumer.-CC.$default$andThen(this, biConsumer);
                }
                return j$.util.function.BiConsumer.-CC.$default$andThen(this, biConsumer);
            }
        }, new java.util.function.BiConsumer() { // from class: ldo
            @Override // java.util.function.BiConsumer
            public final void accept(java.lang.Object obj, java.lang.Object obj2) {
                int i5 = i4;
                if (i5 == 0) {
                    ((j$.util.LongSummaryStatistics) obj).combine((j$.util.LongSummaryStatistics) obj2);
                    return;
                }
                if (i5 == 1) {
                    ((j$.util.LongSummaryStatistics) obj).accept(((java.lang.Long) obj2).longValue());
                    return;
                }
                if (i5 == 2) {
                    ((j$.util.DoubleSummaryStatistics) obj).accept(((java.lang.Double) obj2).doubleValue());
                    return;
                }
                if (i5 == 3) {
                    ((j$.util.DoubleSummaryStatistics) obj).combine((j$.util.DoubleSummaryStatistics) obj2);
                    return;
                }
                if (i5 == 4) {
                    ((j$.util.IntSummaryStatistics) obj).accept(((java.lang.Integer) obj2).intValue());
                } else if (i5 == 5) {
                    ((j$.util.IntSummaryStatistics) obj).combine((j$.util.IntSummaryStatistics) obj2);
                } else {
                    aesp.b(((aesr) obj).b());
                }
            }

            @Override // java.util.function.BiConsumer
            public final /* synthetic */ java.util.function.BiConsumer andThen(java.util.function.BiConsumer biConsumer) {
                int i5 = i4;
                if (i5 == 0) {
                    return j$.util.function.BiConsumer.-CC.$default$andThen(this, biConsumer);
                }
                if (i5 == 1) {
                    return j$.util.function.BiConsumer.-CC.$default$andThen(this, biConsumer);
                }
                if (i5 == 2) {
                    return j$.util.function.BiConsumer.-CC.$default$andThen(this, biConsumer);
                }
                if (i5 == 3) {
                    return j$.util.function.BiConsumer.-CC.$default$andThen(this, biConsumer);
                }
                if (i5 != 4) {
                    return i5 != 5 ? j$.util.function.BiConsumer.-CC.$default$andThen(this, biConsumer) : j$.util.function.BiConsumer.-CC.$default$andThen(this, biConsumer);
                }
                return j$.util.function.BiConsumer.-CC.$default$andThen(this, biConsumer);
            }
        });
        final int i5 = 4;
        final int i6 = 5;
        j$.util.IntSummaryStatistics intSummaryStatistics = (j$.util.IntSummaryStatistics) j$.util.Collection.-EL.stream(list).collect(new defpackage.iaz(10), new java.util.function.BiConsumer() { // from class: ldo
            @Override // java.util.function.BiConsumer
            public final void accept(java.lang.Object obj, java.lang.Object obj2) {
                int i7 = i5;
                if (i7 == 0) {
                    ((j$.util.LongSummaryStatistics) obj).combine((j$.util.LongSummaryStatistics) obj2);
                    return;
                }
                if (i7 == 1) {
                    ((j$.util.LongSummaryStatistics) obj).accept(((java.lang.Long) obj2).longValue());
                    return;
                }
                if (i7 == 2) {
                    ((j$.util.DoubleSummaryStatistics) obj).accept(((java.lang.Double) obj2).doubleValue());
                    return;
                }
                if (i7 == 3) {
                    ((j$.util.DoubleSummaryStatistics) obj).combine((j$.util.DoubleSummaryStatistics) obj2);
                    return;
                }
                if (i7 == 4) {
                    ((j$.util.IntSummaryStatistics) obj).accept(((java.lang.Integer) obj2).intValue());
                } else if (i7 == 5) {
                    ((j$.util.IntSummaryStatistics) obj).combine((j$.util.IntSummaryStatistics) obj2);
                } else {
                    aesp.b(((aesr) obj).b());
                }
            }

            @Override // java.util.function.BiConsumer
            public final /* synthetic */ java.util.function.BiConsumer andThen(java.util.function.BiConsumer biConsumer) {
                int i7 = i5;
                if (i7 == 0) {
                    return j$.util.function.BiConsumer.-CC.$default$andThen(this, biConsumer);
                }
                if (i7 == 1) {
                    return j$.util.function.BiConsumer.-CC.$default$andThen(this, biConsumer);
                }
                if (i7 == 2) {
                    return j$.util.function.BiConsumer.-CC.$default$andThen(this, biConsumer);
                }
                if (i7 == 3) {
                    return j$.util.function.BiConsumer.-CC.$default$andThen(this, biConsumer);
                }
                if (i7 != 4) {
                    return i7 != 5 ? j$.util.function.BiConsumer.-CC.$default$andThen(this, biConsumer) : j$.util.function.BiConsumer.-CC.$default$andThen(this, biConsumer);
                }
                return j$.util.function.BiConsumer.-CC.$default$andThen(this, biConsumer);
            }
        }, new java.util.function.BiConsumer() { // from class: ldo
            @Override // java.util.function.BiConsumer
            public final void accept(java.lang.Object obj, java.lang.Object obj2) {
                int i7 = i6;
                if (i7 == 0) {
                    ((j$.util.LongSummaryStatistics) obj).combine((j$.util.LongSummaryStatistics) obj2);
                    return;
                }
                if (i7 == 1) {
                    ((j$.util.LongSummaryStatistics) obj).accept(((java.lang.Long) obj2).longValue());
                    return;
                }
                if (i7 == 2) {
                    ((j$.util.DoubleSummaryStatistics) obj).accept(((java.lang.Double) obj2).doubleValue());
                    return;
                }
                if (i7 == 3) {
                    ((j$.util.DoubleSummaryStatistics) obj).combine((j$.util.DoubleSummaryStatistics) obj2);
                    return;
                }
                if (i7 == 4) {
                    ((j$.util.IntSummaryStatistics) obj).accept(((java.lang.Integer) obj2).intValue());
                } else if (i7 == 5) {
                    ((j$.util.IntSummaryStatistics) obj).combine((j$.util.IntSummaryStatistics) obj2);
                } else {
                    aesp.b(((aesr) obj).b());
                }
            }

            @Override // java.util.function.BiConsumer
            public final /* synthetic */ java.util.function.BiConsumer andThen(java.util.function.BiConsumer biConsumer) {
                int i7 = i6;
                if (i7 == 0) {
                    return j$.util.function.BiConsumer.-CC.$default$andThen(this, biConsumer);
                }
                if (i7 == 1) {
                    return j$.util.function.BiConsumer.-CC.$default$andThen(this, biConsumer);
                }
                if (i7 == 2) {
                    return j$.util.function.BiConsumer.-CC.$default$andThen(this, biConsumer);
                }
                if (i7 == 3) {
                    return j$.util.function.BiConsumer.-CC.$default$andThen(this, biConsumer);
                }
                if (i7 != 4) {
                    return i7 != 5 ? j$.util.function.BiConsumer.-CC.$default$andThen(this, biConsumer) : j$.util.function.BiConsumer.-CC.$default$andThen(this, biConsumer);
                }
                return j$.util.function.BiConsumer.-CC.$default$andThen(this, biConsumer);
            }
        });
        akzx akzxVarM = ampb.a.m();
        akzxVarM.u();
        ampb ampbVar = akzxVarM.b;
        j$.util.Objects.requireNonNull(str);
        ampbVar.b |= 1;
        ampbVar.c = str;
        akzxVarM.u();
        ampb ampbVar2 = akzxVarM.b;
        ampbVar2.b |= 2;
        ampbVar2.d = j;
        akzx akzxVarM2 = ampa.a.m();
        akzxVarM2.u();
        ampa ampaVar = akzxVarM2.b;
        ampaVar.b |= 1;
        ampaVar.c = j2;
        long min = longSummaryStatistics.getCount() == 0 ? 0L : longSummaryStatistics.getMin();
        akzxVarM2.u();
        ampa ampaVar2 = akzxVarM2.b;
        ampaVar2.b |= 2;
        ampaVar2.d = min;
        double average = longSummaryStatistics.getAverage();
        akzxVarM2.u();
        ampa ampaVar3 = akzxVarM2.b;
        ampaVar3.b |= 4;
        ampaVar3.e = average;
        long max = longSummaryStatistics.getCount() == 0 ? 0L : longSummaryStatistics.getMax();
        akzxVarM2.u();
        ampa ampaVar4 = akzxVarM2.b;
        ampaVar4.b |= 8;
        ampaVar4.f = max;
        double min2 = doubleSummaryStatistics.getCount() == 0 ? 0.0d : doubleSummaryStatistics.getMin();
        akzxVarM2.u();
        ampa ampaVar5 = akzxVarM2.b;
        ampaVar5.b |= 16;
        ampaVar5.g = min2;
        double average2 = doubleSummaryStatistics.getAverage();
        akzxVarM2.u();
        ampa ampaVar6 = akzxVarM2.b;
        ampaVar6.b |= 32;
        ampaVar6.h = average2;
        double max2 = doubleSummaryStatistics.getCount() != 0 ? doubleSummaryStatistics.getMax() : 0.0d;
        akzxVarM2.u();
        ampa ampaVar7 = akzxVarM2.b;
        ampaVar7.b |= 64;
        ampaVar7.i = max2;
        long min3 = intSummaryStatistics.getCount() == 0 ? 0L : intSummaryStatistics.getMin();
        akzxVarM2.u();
        ampa ampaVar8 = akzxVarM2.b;
        ampaVar8.b |= 128;
        ampaVar8.j = min3;
        double average3 = intSummaryStatistics.getAverage();
        akzxVarM2.u();
        ampa ampaVar9 = akzxVarM2.b;
        ampaVar9.b |= 256;
        ampaVar9.k = average3;
        long max3 = intSummaryStatistics.getCount() == 0 ? 0L : intSummaryStatistics.getMax();
        akzxVarM2.u();
        ampa ampaVar10 = akzxVarM2.b;
        ampaVar10.b |= 512;
        ampaVar10.l = max3;
        ampa ampaVarP = akzxVarM2.p();
        akzxVarM.u();
        ampb ampbVar3 = akzxVarM.b;
        j$.util.Objects.requireNonNull(ampaVarP);
        ampbVar3.e = ampaVarP;
        ampbVar3.b |= 4;
        akzxVarM.u();
        ampb ampbVar4 = akzxVarM.b;
        alat alatVar = ampbVar4.f;
        if (!alatVar.c()) {
            ampbVar4.f = alad.J(alatVar);
        }
        akyl.i(ldnVar.d, ampbVar4.f);
        akzxVarM.u();
        ampb ampbVar5 = akzxVarM.b;
        alat alatVar2 = ampbVar5.g;
        if (!alatVar2.c()) {
            ampbVar5.g = alad.J(alatVar2);
        }
        akyl.i(ldnVar.e, ampbVar5.g);
        return akzxVarM.p();
    }
}
