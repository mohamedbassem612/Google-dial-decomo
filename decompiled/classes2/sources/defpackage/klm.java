package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class klm extends android.content.BroadcastReceiver {
    public final /* synthetic */ defpackage.klo a;

    public klm(defpackage.klo kloVar) {
        j$.util.Objects.requireNonNull(kloVar);
        this.a = kloVar;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00d5 A[Catch: all -> 0x0236, TryCatch #0 {all -> 0x0236, blocks: (B:3:0x0016, B:7:0x0045, B:9:0x0052, B:10:0x005e, B:14:0x0071, B:16:0x0082, B:35:0x00ec, B:37:0x00f0, B:39:0x00f4, B:41:0x00fb, B:43:0x0106, B:45:0x010c, B:46:0x010e, B:48:0x0114, B:50:0x011d, B:52:0x012f, B:53:0x0131, B:55:0x013a, B:57:0x0140, B:59:0x0144, B:61:0x014f, B:65:0x015a, B:67:0x0165, B:68:0x0176, B:69:0x017d, B:70:0x017e, B:71:0x0182, B:73:0x0188, B:75:0x018e, B:40:0x00f9, B:76:0x01a1, B:78:0x01a6, B:80:0x01d2, B:82:0x01d9, B:84:0x01e0, B:85:0x01e2, B:87:0x01ef, B:88:0x01f1, B:89:0x01f7, B:91:0x01fd, B:92:0x020f, B:81:0x01d7, B:20:0x008f, B:22:0x0096, B:24:0x009a, B:26:0x00a2, B:32:0x00c4, B:34:0x00d5, B:21:0x0094, B:13:0x0066), top: B:102:0x0016 }] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.content.BroadcastReceiver
    public final void onReceive(android.content.Context context, android.content.Intent intent) {
        j$.util.Optional optional;
        char c;
        java.util.Collection collection;
        int i;
        char c2;
        int i2;
        char c3;
        char c4;
        char c5;
        defpackage.lyb lybVarC;
        defpackage.klo kloVar = this.a;
        ahok ahokVarF = kloVar.r.f(200, "Broadcast to CallLogFragmentPeer.CallLogItemDeleteRequestReceiver");
        try {
            aimz aimzVar = defpackage.klo.a;
            aimzVar.b().l("com/android/dialer/calllog/ui/CallLogFragmentPeer$CallLogItemDeleteRequestReceiver", "onReceive", 782, "CallLogFragmentPeer.java").v("onReceive");
            defpackage.kmc kmcVarO = akmr.o(intent, "delete_calls_context", defpackage.kmc.a, akzq.a());
            ahvr.bN(defpackage.hgu.x(kmcVarO.c) != 1, "nothing set to delete");
            j$.util.Optional optionalOfNullable = kloVar.G;
            if (true == optionalOfNullable.isPresent()) {
                optionalOfNullable = j$.util.Optional.ofNullable(((defpackage.kfd) optionalOfNullable.get()).b);
            }
            if (true != optionalOfNullable.isPresent()) {
                optional = optionalOfNullable;
            } else {
                optional = ((defpackage.kdf) optionalOfNullable.get()).a;
                optional.getClass();
            }
            java.util.Collection collection2 = (aify) optional.orElse(aike.a);
            if (((defpackage.kdf) optionalOfNullable.orElse((java.lang.Object) null)) != null) {
                int i3 = kmcVarO.c;
                if (i3 == 2) {
                    c5 = 1;
                    i = 0;
                } else {
                    kiu kiuVar = i3 == 3 ? (kiu) kmcVarO.d : kiu.a;
                    int i4 = kiuVar.y;
                    if (i4 >= 0) {
                        c4 = 1;
                        if (i4 < collection2.size()) {
                            collection = collection2;
                            i = 0;
                            if (((defpackage.kdc) collection2.get(kiuVar.y)).a.d == kiuVar.d) {
                                c = c4;
                                c2 = c4;
                                i2 = 1;
                                c3 = c4;
                            }
                            c5 = c3;
                            if ((i2 | (j$.util.Collection.-EL.stream(collection).anyMatch(new defpackage.jty(kiuVar, 7)) ? 1 : 0)) == 0) {
                                aimzVar.b().l("com/android/dialer/calllog/ui/CallLogFragmentPeer$CallLogItemDeleteRequestReceiver", "handleDeleteRequestCallLogUiModelRows", 820, "CallLogFragmentPeer.java").v("coalescedRow requested to delete does not exist");
                            }
                        }
                        c = c4;
                        c2 = c4;
                        i2 = i;
                        c3 = c2;
                        c5 = c3;
                        if ((i2 | (j$.util.Collection.-EL.stream(collection).anyMatch(new defpackage.jty(kiuVar, 7)) ? 1 : 0)) == 0) {
                            aimzVar.b().l("com/android/dialer/calllog/ui/CallLogFragmentPeer$CallLogItemDeleteRequestReceiver", "handleDeleteRequestCallLogUiModelRows", 820, "CallLogFragmentPeer.java").v("coalescedRow requested to delete does not exist");
                        }
                    } else {
                        c = 1;
                    }
                    c = c4;
                    collection = collection2;
                    i = 0;
                    c2 = c;
                    c = c4;
                    c2 = c4;
                    i2 = i;
                    c3 = c2;
                    c5 = c3;
                    if ((i2 | (j$.util.Collection.-EL.stream(collection).anyMatch(new defpackage.jty(kiuVar, 7)) ? 1 : 0)) == 0) {
                        aimzVar.b().l("com/android/dialer/calllog/ui/CallLogFragmentPeer$CallLogItemDeleteRequestReceiver", "handleDeleteRequestCallLogUiModelRows", 820, "CallLogFragmentPeer.java").v("coalescedRow requested to delete does not exist");
                    }
                }
                int i5 = kmcVarO.c;
                if (i5 == 3) {
                    defpackage.kgo kgoVar = kloVar.H;
                    kiu kiuVar2 = i5 == 3 ? (kiu) kmcVarO.d : kiu.a;
                    aooh.f(kiuVar2, "rowToDelete");
                    defpackage.kna knaVarB = kgoVar.b();
                    if (knaVarB != null) {
                        long j = kiuVar2.d;
                        kiu kiuVar3 = knaVarB.c;
                        if (kiuVar3 == null) {
                            kiuVar3 = kiu.a;
                        }
                        if (j == kiuVar3.d) {
                            kgoVar.d(null);
                            defpackage.kna knaVarB2 = kgoVar.b();
                            if (knaVarB2 != null) {
                                java.lang.Object obj = kgoVar.a;
                                u uVar = new u(((az) obj).a());
                                kiu kiuVar4 = knaVarB2.c;
                                if (kiuVar4 == null) {
                                    kiuVar4 = kiu.a;
                                }
                                defpackage.kgo.g(uVar, kiuVar4);
                                if (!uVar.h() && kgoVar.e()) {
                                    if (kgoVar.c == null) {
                                        java.lang.Object obj2 = kgoVar.d;
                                        kgoVar.c = new defpackage.jyc(kgoVar, (rhx.b((android.content.Context) obj) || kgoVar.c() == null) ? i : c5);
                                        if (kgoVar.c == null) {
                                            throw new java.lang.IllegalStateException("the recentsTabBackPressHandler is null");
                                        }
                                        nf nfVarFc = ((mp) obj).fc();
                                        java.lang.Object obj3 = kgoVar.c;
                                        aooh.c(obj3);
                                        nfVarFc.c((na) obj3);
                                    }
                                    uVar.c();
                                }
                            } else if (kgoVar.e() && (lybVarC = kgoVar.c()) != null) {
                                u uVar2 = new u(((az) kgoVar.a).a());
                                uVar2.k(lybVarC);
                                uVar2.c();
                            }
                        }
                    }
                }
                int i6 = kmcVarO.c;
                if (i6 == 2) {
                    ajcq ajcqVarA = kloVar.e.a();
                    ajcq ajcqVarE = kloVar.l.e(android.provider.CallLog.Calls.CONTENT_URI, (java.lang.String) null, (java.lang.String[]) null);
                    defpackage.lpa lpaVar = kloVar.B;
                    ajcq[] ajcqVarArr = new ajcq[2];
                    ajcqVarArr[i] = ajcqVarA;
                    ajcqVarArr[c5] = ajcqVarE;
                    lpaVar.b(context, aiql.w(ajcqVarArr), new defpackage.joy(2), new defpackage.jox(4));
                } else {
                    kiu kiuVar5 = i6 == 3 ? (kiu) kmcVarO.d : kiu.a;
                    defpackage.kis kisVar = kiuVar5.u;
                    if (kisVar == null) {
                        kisVar = defpackage.kis.a;
                    }
                    java.util.ArrayList arrayList = new java.util.ArrayList(kisVar.b.size());
                    defpackage.kis kisVar2 = kiuVar5.u;
                    if (kisVar2 == null) {
                        kisVar2 = defpackage.kis.a;
                    }
                    java.util.Iterator it = kisVar2.b.iterator();
                    while (it.hasNext()) {
                        arrayList.add(java.lang.String.valueOf(((java.lang.Long) it.next()).longValue()));
                    }
                    kloVar.C.b(context, kloVar.c.eU(ahqx.i(new defpackage.hsl(this, arrayList, kiuVar5, 5, (char[]) null))), new defpackage.kll(this, i), new defpackage.jox(5));
                }
            }
            ahokVarF.close();
        } catch (java.lang.Throwable th) {
            try {
                ahokVarF.close();
                throw th;
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }
}
