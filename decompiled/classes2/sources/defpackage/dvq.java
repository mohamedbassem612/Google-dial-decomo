package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class dvq implements android.os.Handler.Callback, android.content.ServiceConnection {
    public final android.os.Handler a;
    private final android.content.Context b;
    private final android.os.HandlerThread c;
    private final java.util.Map d = new java.util.HashMap();
    private java.util.Set e = new java.util.HashSet();

    public dvq(android.content.Context context) {
        this.b = context;
        android.os.HandlerThread handlerThread = new android.os.HandlerThread("NotificationManagerCompat");
        this.c = handlerThread;
        handlerThread.start();
        this.a = new android.os.Handler(handlerThread.getLooper(), this);
    }

    private final void a(defpackage.dvp dvpVar) {
        if (dvpVar.b) {
            this.b.unbindService(this);
            dvpVar.b = false;
        }
        dvpVar.e = null;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x006f  */
    /* JADX WARN: Code duplicated, block: B:17:0x0073 A[LOOP:0: B:17:0x0073->B:25:0x00b1, LOOP_START] */
    /* JADX WARN: Code duplicated, block: B:21:0x0081 A[Catch: RemoteException -> 0x00c5, DeadObjectException -> 0x00d9, TryCatch #3 {DeadObjectException -> 0x00d9, RemoteException -> 0x00c5, blocks: (B:19:0x007b, B:21:0x0081, B:22:0x008a, B:25:0x00b1, B:30:0x00c1, B:31:0x00c4), top: B:44:0x007b }] */
    /* JADX WARN: Code duplicated, block: B:25:0x00b1 A[Catch: RemoteException -> 0x00c5, DeadObjectException -> 0x00d9, LOOP:0: B:17:0x0073->B:25:0x00b1, LOOP_END, TRY_ENTER, TRY_LEAVE, TryCatch #3 {DeadObjectException -> 0x00d9, RemoteException -> 0x00c5, blocks: (B:19:0x007b, B:21:0x0081, B:22:0x008a, B:25:0x00b1, B:30:0x00c1, B:31:0x00c4), top: B:44:0x007b }] */
    /* JADX WARN: Code duplicated, block: B:39:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:44:0x007b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:0x00f1 A[EDGE_INSN: B:46:0x00f1->B:37:0x00f1 BREAK  A[LOOP:0: B:17:0x0073->B:25:0x00b1], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:47:0x00b8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:49:? A[RETURN, SYNTHETIC] */
    private final void b(defpackage.dvp dvpVar) {
        defpackage.dvo dvoVar;
        defpackage.duv duvVar;
        android.os.Parcel parcelObtain;
        if (android.util.Log.isLoggable("NotifManCompat", 3)) {
            android.util.Log.d("NotifManCompat", "Processing component " + dvpVar.a + ", " + dvpVar.c.size() + " queued tasks");
        }
        java.util.ArrayDeque arrayDeque = dvpVar.c;
        if (arrayDeque.isEmpty()) {
            return;
        }
        if (!dvpVar.b) {
            android.content.Intent intent = new android.content.Intent("android.support.BIND_NOTIFICATION_SIDE_CHANNEL");
            android.content.ComponentName componentName = dvpVar.a;
            android.content.Intent component = intent.setComponent(componentName);
            android.content.Context context = this.b;
            boolean zBindService = context.bindService(component, this, 33);
            dvpVar.b = zBindService;
            if (zBindService) {
                dvpVar.d = 0;
            } else {
                java.util.Objects.toString(componentName);
                android.util.Log.w("NotifManCompat", "Unable to bind to listener ".concat(java.lang.String.valueOf(componentName)));
                context.unbindService(this);
            }
            if (dvpVar.b) {
                if (dvpVar.e != null) {
                    while (true) {
                        dvoVar = (defpackage.dvo) arrayDeque.peek();
                        if (dvoVar != null) {
                            break;
                        }
                        try {
                            if (android.util.Log.isLoggable("NotifManCompat", 3)) {
                                android.util.Log.d("NotifManCompat", a.bh(dvoVar, "Sending task "));
                            }
                            duvVar = dvpVar.e;
                            android.app.Notification notification = dvoVar.c;
                            int i = dvoVar.b;
                            java.lang.String str = dvoVar.a;
                            parcelObtain = android.os.Parcel.obtain();
                            try {
                                parcelObtain.writeInterfaceToken("android.support.v4.app.INotificationSideChannel");
                                parcelObtain.writeString(str);
                                parcelObtain.writeInt(i);
                                parcelObtain.writeString(null);
                                parcelObtain.writeTypedObject(notification, 0);
                                if (duvVar.a.transact(1, parcelObtain, null, 1)) {
                                    throw new android.os.RemoteException("Method notify is unimplemented.");
                                }
                                parcelObtain.recycle();
                                arrayDeque.remove();
                            } catch (java.lang.Throwable th) {
                                parcelObtain.recycle();
                                throw th;
                            }
                        } catch (android.os.DeadObjectException unused) {
                            if (android.util.Log.isLoggable("NotifManCompat", 3)) {
                                android.content.ComponentName componentName2 = dvpVar.a;
                                java.util.Objects.toString(componentName2);
                                android.util.Log.d("NotifManCompat", "Remote service has died: ".concat(java.lang.String.valueOf(componentName2)));
                            }
                        } catch (android.os.RemoteException e) {
                            android.content.ComponentName componentName3 = dvpVar.a;
                            java.util.Objects.toString(componentName3);
                            android.util.Log.w("NotifManCompat", "RemoteException communicating with ".concat(java.lang.String.valueOf(componentName3)), e);
                        }
                    }
                    if (dvpVar.c.isEmpty()) {
                        return;
                    }
                    c(dvpVar);
                    return;
                }
            }
        } else if (dvpVar.e != null) {
            while (true) {
                dvoVar = (defpackage.dvo) arrayDeque.peek();
                if (dvoVar != null) {
                    break;
                    break;
                }
                if (android.util.Log.isLoggable("NotifManCompat", 3)) {
                    android.util.Log.d("NotifManCompat", a.bh(dvoVar, "Sending task "));
                }
                duvVar = dvpVar.e;
                android.app.Notification notification2 = dvoVar.c;
                int i2 = dvoVar.b;
                java.lang.String str2 = dvoVar.a;
                parcelObtain = android.os.Parcel.obtain();
                parcelObtain.writeInterfaceToken("android.support.v4.app.INotificationSideChannel");
                parcelObtain.writeString(str2);
                parcelObtain.writeInt(i2);
                parcelObtain.writeString(null);
                parcelObtain.writeTypedObject(notification2, 0);
                if (duvVar.a.transact(1, parcelObtain, null, 1)) {
                    throw new android.os.RemoteException("Method notify is unimplemented.");
                }
                parcelObtain.recycle();
                arrayDeque.remove();
            }
            if (dvpVar.c.isEmpty()) {
                c(dvpVar);
                return;
            }
            return;
        }
        c(dvpVar);
    }

    private final void c(defpackage.dvp dvpVar) {
        android.content.ComponentName componentName = dvpVar.a;
        android.os.Handler handler = this.a;
        if (handler.hasMessages(3, componentName)) {
            return;
        }
        int i = dvpVar.d;
        int i2 = i + 1;
        dvpVar.d = i2;
        if (i2 <= 6) {
            int i3 = (1 << i) * 1000;
            if (android.util.Log.isLoggable("NotifManCompat", 3)) {
                android.util.Log.d("NotifManCompat", a.bs(i3, "Scheduling retry for ", " ms"));
            }
            handler.sendMessageDelayed(handler.obtainMessage(3, componentName), i3);
            return;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Giving up on delivering ");
        java.util.ArrayDeque arrayDeque = dvpVar.c;
        sb.append(arrayDeque.size());
        sb.append(" tasks to ");
        sb.append(componentName);
        sb.append(" after ");
        sb.append(dvpVar.d);
        sb.append(" retries");
        android.util.Log.w("NotifManCompat", sb.toString());
        arrayDeque.clear();
    }

    /* JADX WARN: Type inference failed for: r11v5, types: [android.os.IBinder, java.lang.Object] */
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(android.os.Message message) {
        java.util.Set set;
        defpackage.duv duvVar;
        int i = message.what;
        if (i == 0) {
            defpackage.dvo dvoVar = (defpackage.dvo) message.obj;
            android.content.Context context = this.b;
            java.lang.Object obj = dvr.a;
            java.lang.String string = android.provider.Settings.Secure.getString(context.getContentResolver(), "enabled_notification_listeners");
            synchronized (dvr.a) {
                if (string != null) {
                    if (!string.equals(dvr.b)) {
                        java.lang.String[] strArrSplit = string.split(":", -1);
                        java.util.HashSet hashSet = new java.util.HashSet(strArrSplit.length);
                        for (java.lang.String str : strArrSplit) {
                            android.content.ComponentName componentNameUnflattenFromString = android.content.ComponentName.unflattenFromString(str);
                            if (componentNameUnflattenFromString != null) {
                                hashSet.add(componentNameUnflattenFromString.getPackageName());
                            }
                        }
                        dvr.c = hashSet;
                        dvr.b = string;
                    }
                }
                set = dvr.c;
            }
            if (!set.equals(this.e)) {
                this.e = set;
                java.util.List<android.content.pm.ResolveInfo> listQueryIntentServices = this.b.getPackageManager().queryIntentServices(new android.content.Intent().setAction("android.support.BIND_NOTIFICATION_SIDE_CHANNEL"), 0);
                java.util.HashSet<android.content.ComponentName> hashSet2 = new java.util.HashSet();
                for (android.content.pm.ResolveInfo resolveInfo : listQueryIntentServices) {
                    if (set.contains(resolveInfo.serviceInfo.packageName)) {
                        android.content.ComponentName componentName = new android.content.ComponentName(resolveInfo.serviceInfo.packageName, resolveInfo.serviceInfo.name);
                        if (resolveInfo.serviceInfo.permission != null) {
                            android.util.Log.w("NotifManCompat", a.bg(componentName, "Permission present on component ", ", not adding listener record."));
                        } else {
                            hashSet2.add(componentName);
                        }
                    }
                }
                for (android.content.ComponentName componentName2 : hashSet2) {
                    java.util.Map map = this.d;
                    if (!map.containsKey(componentName2)) {
                        if (android.util.Log.isLoggable("NotifManCompat", 3)) {
                            java.util.Objects.toString(componentName2);
                            android.util.Log.d("NotifManCompat", "Adding listener record for ".concat(java.lang.String.valueOf(componentName2)));
                        }
                        map.put(componentName2, new defpackage.dvp(componentName2));
                    }
                }
                java.util.Iterator it = this.d.entrySet().iterator();
                while (it.hasNext()) {
                    java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
                    if (!hashSet2.contains(entry.getKey())) {
                        if (android.util.Log.isLoggable("NotifManCompat", 3)) {
                            java.lang.Object key = entry.getKey();
                            java.util.Objects.toString(key);
                            android.util.Log.d("NotifManCompat", "Removing listener record for ".concat(java.lang.String.valueOf(key)));
                        }
                        a((defpackage.dvp) entry.getValue());
                        it.remove();
                    }
                }
            }
            for (defpackage.dvp dvpVar : this.d.values()) {
                dvpVar.c.add(dvoVar);
                b(dvpVar);
            }
        } else if (i == 1) {
            vx vxVar = (vx) message.obj;
            java.lang.Object obj2 = vxVar.a;
            ?? r11 = vxVar.b;
            defpackage.dvp dvpVar2 = (defpackage.dvp) this.d.get(obj2);
            if (dvpVar2 != null) {
                if (r11 == 0) {
                    duvVar = null;
                } else {
                    android.os.IInterface iInterfaceQueryLocalInterface = r11.queryLocalInterface("android.support.v4.app.INotificationSideChannel");
                    duvVar = (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof defpackage.duv)) ? new defpackage.duv(r11) : (defpackage.duv) iInterfaceQueryLocalInterface;
                }
                dvpVar2.e = duvVar;
                dvpVar2.d = 0;
                b(dvpVar2);
            }
        } else if (i == 2) {
            defpackage.dvp dvpVar3 = (defpackage.dvp) this.d.get((android.content.ComponentName) message.obj);
            if (dvpVar3 != null) {
                a(dvpVar3);
            }
        } else {
            if (i != 3) {
                return false;
            }
            defpackage.dvp dvpVar4 = (defpackage.dvp) this.d.get((android.content.ComponentName) message.obj);
            if (dvpVar4 != null) {
                b(dvpVar4);
            }
        }
        return true;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(android.content.ComponentName componentName, android.os.IBinder iBinder) {
        if (android.util.Log.isLoggable("NotifManCompat", 3)) {
            java.util.Objects.toString(componentName);
            android.util.Log.d("NotifManCompat", "Connected to service ".concat(java.lang.String.valueOf(componentName)));
        }
        this.a.obtainMessage(1, new vx(componentName, iBinder)).sendToTarget();
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(android.content.ComponentName componentName) {
        if (android.util.Log.isLoggable("NotifManCompat", 3)) {
            java.util.Objects.toString(componentName);
            android.util.Log.d("NotifManCompat", "Disconnected from service ".concat(java.lang.String.valueOf(componentName)));
        }
        this.a.obtainMessage(2, componentName).sendToTarget();
    }
}
