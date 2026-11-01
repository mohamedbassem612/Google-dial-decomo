package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class evi {
    private final defpackage.evh c;
    private defpackage.evg f;
    private final java.util.ArrayDeque d = new java.util.ArrayDeque();
    private final java.util.ArrayDeque e = new java.util.ArrayDeque();
    public final java.util.PriorityQueue a = new java.util.PriorityQueue();
    public int b = -1;

    public evi(defpackage.evh evhVar) {
        this.c = evhVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0026, code lost:
    
        if (r7 >= r0.b) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(long r7, defpackage.etx r9) {
        /*
            r6 = this;
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r2 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r2 == 0) goto L92
            int r0 = r6.b
            if (r0 == 0) goto L93
            r1 = -1
            if (r0 == r1) goto L28
            java.util.PriorityQueue r0 = r6.a
            int r2 = r0.size()
            int r3 = r6.b
            if (r2 < r3) goto L28
            java.lang.Object r0 = r0.peek()
            evg r0 = (defpackage.evg) r0
            java.lang.String r2 = eum.a
            long r2 = r0.b
            int r0 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r0 < 0) goto L93
        L28:
            java.util.ArrayDeque r0 = r6.d
            boolean r2 = r0.isEmpty()
            if (r2 == 0) goto L36
            etx r0 = new etx
            r0.<init>()
            goto L3c
        L36:
            java.lang.Object r0 = r0.pop()
            etx r0 = (defpackage.etx) r0
        L3c:
            int r2 = r9.d()
            r0.M(r2)
            byte[] r2 = r9.b
            int r9 = r9.c
            byte[] r3 = r0.b
            r4 = 0
            int r5 = r0.d()
            java.lang.System.arraycopy(r2, r9, r3, r4, r5)
            evg r9 = r6.f
            if (r9 == 0) goto L61
            long r2 = r9.b
            int r2 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r2 != 0) goto L61
            java.util.List r6 = r9.a
            r6.add(r0)
            goto L98
        L61:
            java.util.ArrayDeque r9 = r6.e
            boolean r2 = r9.isEmpty()
            if (r2 == 0) goto L6f
            evg r9 = new evg
            r9.<init>()
            goto L75
        L6f:
            java.lang.Object r9 = r9.pop()
            evg r9 = (defpackage.evg) r9
        L75:
            java.util.List r2 = r9.a
            boolean r3 = r2.isEmpty()
            ahvr.bY(r3)
            r9.b = r7
            r2.add(r0)
            java.util.PriorityQueue r7 = r6.a
            r7.add(r9)
            r6.f = r9
            int r7 = r6.b
            if (r7 == r1) goto L98
            r6.b(r7)
            goto L98
        L92:
            r7 = r0
        L93:
            evh r6 = r6.c
            r6.a(r7, r9)
        L98:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.evi.a(long, etx):void");
    }

    public final void b(int i) {
        java.util.List list;
        while (true) {
            java.util.PriorityQueue priorityQueue = this.a;
            if (priorityQueue.size() <= i) {
                return;
            }
            defpackage.evg evgVar = (defpackage.evg) priorityQueue.poll();
            java.lang.String str = eum.a;
            int i2 = 0;
            while (true) {
                list = evgVar.a;
                if (i2 >= list.size()) {
                    break;
                }
                this.c.a(evgVar.b, (defpackage.etx) list.get(i2));
                this.d.push((defpackage.etx) list.get(i2));
                i2++;
            }
            list.clear();
            defpackage.evg evgVar2 = this.f;
            if (evgVar2 != null && evgVar2.b == evgVar.b) {
                this.f = null;
            }
            this.e.push(evgVar);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [boolean, int] */
    public final void c(int i) {
        ahvr.bY((boolean) ((i ^ (-1)) >>> 31));
        this.b = i;
        b(i);
    }
}
