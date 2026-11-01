package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ewo extends defpackage.evm {
    private final byte[] a;
    private final java.net.DatagramPacket b;
    private android.net.Uri c;
    private java.net.DatagramSocket d;
    private java.net.MulticastSocket e;
    private java.net.InetAddress f;
    private boolean g;
    private int h;

    public ewo() {
        super(true);
        byte[] bArr = new byte[2000];
        this.a = bArr;
        this.b = new java.net.DatagramPacket(bArr, 0, 2000);
    }

    @Override // defpackage.epz
    public final int a(byte[] bArr, int i, int i2) throws defpackage.ewn {
        if (i2 == 0) {
            return 0;
        }
        if (this.h == 0) {
            try {
                java.net.DatagramSocket datagramSocket = this.d;
                ahvr.ci(datagramSocket);
                datagramSocket.receive(this.b);
                int length = this.b.getLength();
                this.h = length;
                g(length);
            } catch (java.net.SocketTimeoutException e) {
                throw new defpackage.ewn(e, 2002);
            } catch (java.io.IOException e2) {
                throw new defpackage.ewn(e2, 2001);
            }
        }
        int length2 = this.b.getLength();
        int i3 = this.h;
        int iMin = java.lang.Math.min(i3, i2);
        java.lang.System.arraycopy(this.a, length2 - i3, bArr, i, iMin);
        this.h -= iMin;
        return iMin;
    }

    @Override // defpackage.evr
    public final long b(defpackage.evv evvVar) throws defpackage.ewn {
        android.net.Uri uri = evvVar.a;
        this.c = uri;
        java.lang.String host = uri.getHost();
        ahvr.ci(host);
        int port = this.c.getPort();
        j();
        try {
            this.f = java.net.InetAddress.getByName(host);
            java.net.InetSocketAddress inetSocketAddress = new java.net.InetSocketAddress(this.f, port);
            if (this.f.isMulticastAddress()) {
                java.net.MulticastSocket multicastSocket = new java.net.MulticastSocket(inetSocketAddress);
                this.e = multicastSocket;
                multicastSocket.joinGroup(this.f);
                this.d = this.e;
            } else {
                this.d = new java.net.DatagramSocket(inetSocketAddress);
            }
            this.d.setSoTimeout(8000);
            this.g = true;
            i(evvVar);
            return -1L;
        } catch (java.io.IOException e) {
            throw new defpackage.ewn(e, 2001);
        } catch (java.lang.SecurityException e2) {
            throw new defpackage.ewn(e2, 2006);
        }
    }

    @Override // defpackage.evr
    public final android.net.Uri c() {
        return this.c;
    }

    @Override // defpackage.evr
    public final void d() {
        this.c = null;
        java.net.MulticastSocket multicastSocket = this.e;
        if (multicastSocket != null) {
            try {
                java.net.InetAddress inetAddress = this.f;
                ahvr.ci(inetAddress);
                multicastSocket.leaveGroup(inetAddress);
            } catch (java.io.IOException unused) {
            }
            this.e = null;
        }
        java.net.DatagramSocket datagramSocket = this.d;
        if (datagramSocket != null) {
            datagramSocket.close();
            this.d = null;
        }
        this.f = null;
        this.h = 0;
        if (this.g) {
            this.g = false;
            h();
        }
    }
}
